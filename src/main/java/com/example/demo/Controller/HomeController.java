package com.example.demo.Controller;

import com.example.demo.Model.prodService;
import com.example.demo.Repository.ProdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {

    @Autowired
    prodService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", service.findAll());

        return "index";
    }
    @GetMapping("/")
    public String createProduct(){
        return "something";
    }
    @PostMapping("/")
    public String delete(long id){

    }

}
