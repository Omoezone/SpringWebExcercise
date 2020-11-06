package com.example.demo.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class prodService {
    @Autowired
    ProdRepo prodRepo;

    // Denne findbyId er optional
    public Product findbyId(long id){
        Optional<Product> opProd = prodRepo.findById(id);
        // hvis ingen product der matcher det søgte id, vil der blive kastet en fejl
        if(!opProd.isPresent()){
            throw new RuntimeException("No product with matching id");
        }

        return opProd.get();
    }

    public Set<Product> findAll()
    {
        //kald repo.findAll og returner
        Set<Product> products = new HashSet<>();
        for(Product product:prodRepo.findAll()) {
            products.add(product);
        }
        return products;
    }
    public void create(Product product)
    {
        prodRepo.save(product);
    }

    // ved update skal id være sat
    public void update(Product product) { prodRepo.save(product); }

    public void delete(Long id) {
        prodRepo.deleteById(id);
    }
}
