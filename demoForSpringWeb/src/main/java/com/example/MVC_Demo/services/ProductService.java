package com.example.MVC_Demo.services;

import com.example.MVC_Demo.Model.Product;
import com.example.MVC_Demo.Model.Student;
import com.example.MVC_Demo.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class ProductService {

    @Autowired
    ProductRepo prodRepo;

//    List<Product> products = new ArrayList<>( Arrays.asList(
//      new Product(101,"T.V",15000),
//      new Product(102,"Mobile",18000),
//      new Product(103,"Laptop",17000),
//      new Product(104,"Gun",16000)
//    )
//    );

    public List<Product> getProducts(){
        return prodRepo.findAll();
    }

    public Product getProductById(int prodId) {
        return prodRepo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product) {
       prodRepo.save(product);
    }


    public void updateProduct(Product product) {
        prodRepo.save(product);
    }

    public void deleteProduct(int prodId) {
       prodRepo.deleteById(prodId);
    }
}


