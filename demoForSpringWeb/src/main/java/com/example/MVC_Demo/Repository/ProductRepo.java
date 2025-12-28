package com.example.MVC_Demo.Repository;

import com.example.MVC_Demo.Model.Product;
import com.example.MVC_Demo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
