package com.senac.senacthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private List<Pessoa> pessoas = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pessoas", pessoas);
        return "index";
    }

    @PostMapping("/adicionar")
    public String adicionarPessoa(String nome) {
        if (nome != null && !nome.isEmpty()) {
            pessoas.add(new Pessoa(nome));
        }
        return "redirect:/";
    }
}
