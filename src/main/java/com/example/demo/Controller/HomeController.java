package com.example.demo.Controller;

import com.example.demo.Repository.ProdRepo;
import org.springframework.stereotype.Controller;


@Controller
public class HomeController {
    ProdRepo prodRepo;
    // constructor injection
    public HomeController(ProdRepo recipeRepository ){
        this.prodRepo = prodRepo;
    }
}
