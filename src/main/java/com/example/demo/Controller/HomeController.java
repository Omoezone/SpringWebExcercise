package com.example.demo.Controller;

import com.example.demo.Service.prodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class HomeController {

    @Autowired
    prodService service;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", service.findAll());

        return "index";
    }

    @GetMapping("/deleteProd/{product_id}")
    public String deleteProd(@PathVariable("product_id")long id){
        service.delete(id);
        return "redirect:/";
    }

}
