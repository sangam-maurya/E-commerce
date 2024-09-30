package com.example.E_commerce.service;

import com.example.E_commerce.Model.Product;
import com.example.E_commerce.reposetry.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public void createData(Product product){
        repository.save(product);
    }
    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product update( long id){
      return   repository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }
}
