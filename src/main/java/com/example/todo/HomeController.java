package com.example.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String helloAdmin() {
        return "<h1>Bonjour l'Admin Sys ! Le conteneur Docker fonctionne à merveille ! 🚀</h1>";
    }
}

