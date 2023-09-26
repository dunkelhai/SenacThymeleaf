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
        // Crie uma lista de nomes
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice"));
        pessoas.add(new Pessoa("Bob"));
        pessoas.add(new Pessoa("Carol"));

        // Adicione a lista ao modelo
        model.addAttribute("pessoas", pessoas);

        // Retorne o nome do arquivo HTML Thymeleaf (por padrão, ele procura em src/main/resources/templates)
        return "index";
    }
}
