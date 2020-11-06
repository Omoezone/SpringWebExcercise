package com.example.demo.Controller;

import com.example.demo.Repository.ProdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @Autowired
    ProdRepo repo;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", repo.findAll());

        return "index";
    }
}
