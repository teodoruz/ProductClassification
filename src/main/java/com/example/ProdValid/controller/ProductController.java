package com.example.ProdValid.controller;

import com.example.ProdValid.entities.Product;
import com.example.ProdValid.entities.ProductDTO;
import com.example.ProdValid.repository.ProductRepository;
import com.example.ProdValid.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping
   public Product classificationProduct(@RequestBody Product product){
       Product p = productService.productClassification(product);
       return productService.saveProduct(p);
   }
   @GetMapping
    public List<Product> findAll(){
      List<Product> findAll = productService.findAll();
      return findAll;
   }







}
