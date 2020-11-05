package com.example.demo.Repository;

import com.example.demo.Model.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProdRepo extends CrudRepository<Product, Long> {

   //   Optional<Product> findById(int id);
   // Set<Product> findAll();
   // Set<Product> findAllByXxx(String x);

}