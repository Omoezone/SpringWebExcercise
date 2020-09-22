package com.example.demo.Repository;

import com.example.demo.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepo {
    @Autowired
    JdbcTemplate template;

    public List<Product> fetchAll(){
        String sql = "SELECT product_id,product_name,product_desc,product_price FROM products";
        RowMapper<Product> rowMapper = new BeanPropertyRowMapper<>(Product.class);
        return template.query(sql,rowMapper);
    }
}
