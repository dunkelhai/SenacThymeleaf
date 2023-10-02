package com.senac.senacthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice"));
        pessoas.add(new Pessoa("Bob"));
        pessoas.add(new Pessoa("Carol"));

        model.addAttribute("pessoas", pessoas);

        return "index";
    }
}
