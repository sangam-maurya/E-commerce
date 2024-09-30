package com.example.E_commerce.reposetry;

import com.example.E_commerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}