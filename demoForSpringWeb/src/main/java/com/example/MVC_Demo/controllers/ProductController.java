package com.example.MVC_Demo.controllers;

import com.example.MVC_Demo.Model.Product;
import com.example.MVC_Demo.Model.Student;
import com.example.MVC_Demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {

    @Autowired
    ProductService prod;

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return prod.getProducts();
    }

    @GetMapping("/getProducts/{prodId}")
    public Product getProductById(@PathVariable int prodId){
            return prod.getProductById(prodId);
    }
    @PostMapping("/addProduct")
   public void addProduct(@RequestBody Product product){
        prod.addProduct(product);
   }

   @PutMapping("/productsUp")
    public void updateProduct(@RequestBody Product product){
        prod.updateProduct(product);
    }

    @DeleteMapping("/ProductDelete/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        prod.deleteProduct(prodId);
    }

}
