package com.senac.senacthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        Scanner entrada = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        boolean continuar = false;
        do {
            System.out.println("Digite um nome:");
            String nome = entrada.nextLine();
            pessoas.add(new Pessoa(nome));
            System.out.println("Continuar?");
            continuar = entrada.nextBoolean();
        } while(continuar);

        model.addAttribute("pessoas", pessoas);

        return "index";
    }
}
