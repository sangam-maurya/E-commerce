package com.example.E_commerce.controller;

import org.springframework.ui.Model;
import com.example.E_commerce.Model.Product;
import com.example.E_commerce.Model.User;
import com.example.E_commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/add")
    public String product(){
        return "Product/addProduct";
    }
    @PostMapping("/product")
    public String createProduct(@ModelAttribute Product product, @RequestParam("userId") Long userId) {
        User user = new User();
        user.setId(userId);
        product.setUser(user);
        service.createData(product);
        return "redirect:/products";
    }

    @GetMapping("/products")
    public String listProducts(Model model) {
        List<Product> productList = service.findAll();
        model.addAttribute("products", productList);
        return "Product/productList";
    }

    @GetMapping("/update/{id}")
    public String updateById(@PathVariable("id") long id, Model model) {
        Product update = service.update(id);
        model.addAttribute("product", update);
        return "Product/UpdateProduct";
    }


    @PostMapping("/products/update")
    public String updateData(@ModelAttribute Product product) {
        service.createData(product);
        return "redirect:/products";
    }

    @PostMapping("/delete/{id}")
    public String deleteById( @PathVariable  long id){
        service.deleteById(id);
         return "redirect:/products";
    }
}
