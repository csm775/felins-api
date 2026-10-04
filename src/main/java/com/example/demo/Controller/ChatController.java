package com.example.demo.Controller;

import com.example.demo.Chat;
import com.example.demo.Service.FelinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatController {

    @Autowired
    private FelinService felinService;

    @GetMapping("/chat/cri")
    public String index() {
        return "Miaouuu";
    }

    @PostMapping("/chat")
    public Chat creerChat(@RequestParam String couleur, @RequestParam int age) {
        return felinService.ajouterChat(couleur, age);
    }

    @GetMapping("/chat/{id}")
    public Chat recupererChat(@PathVariable int id) {
        return felinService.getChat(id);
    }
}