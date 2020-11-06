package com.example.demo.Repository;

import com.example.demo.Model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ProdRepo extends CrudRepository<Product, Long> {

//    Optional<Product> findById(long id);
   // Set<Product> findAll();
   // Set<Product> findAllByXxx(String x);

}