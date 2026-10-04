package com.example.demo.Controller;

import com.example.demo.Tigre;
import com.example.demo.Service.FelinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TigreController {

    @Autowired
    private FelinService felinService;

    @GetMapping("/tigre/cri")
    public String index() {
        return "Grrrrrr";
    }

    @PostMapping("/tigre")
    public Tigre creerTigre(@RequestParam String couleur, @RequestParam int age) {
        return felinService.ajouterTigre(couleur, age);
    }

    @GetMapping("/tigre/{id}")
    public Tigre recupererTigre(@PathVariable int id) {
        return felinService.getTigre(id);
    }
}