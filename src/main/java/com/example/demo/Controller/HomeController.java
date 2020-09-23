package com.example.demo.Controller;

import com.example.demo.Model.Product;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ProductService Prodservice;

    @GetMapping("/")
    String home(Model model){
        List<Product> productList = Prodservice.fetchAll();
        model.addAttribute("products", productList);
        return "index";
    }

    @GetMapping("/create") String productCreate(){ return "productCreate"; }

    @PostMapping("/productCreate")
    String productCreate(@ModelAttribute Product product){
        Prodservice.add(product);
        return "redirect:/";
    }
    @GetMapping("/delete/{product_id}")
    public String delete(@PathVariable("product_id") int id){
        boolean deleted = Prodservice.delete(id);
        if(deleted){
            return "redirect:/";
        }else {
            return "redirect:/";
        }
    }
    @GetMapping("/productUpdate/{product_id}")
    public String productUpdate(@PathVariable("product_id") int product_id, Model model){
        model.addAttribute("product", Prodservice.findById(product_id));
        return "productUpdate";
    }
    @PostMapping("/productUpdate")
    public String productUpdate(@ModelAttribute Product product){
        Prodservice.update(product);
        return "redirect:/";
    }

}
