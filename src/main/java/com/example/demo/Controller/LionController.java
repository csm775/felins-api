package com.example.demo.Controller;

import com.example.demo.Lion;
import com.example.demo.Service.FelinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LionController {

    @Autowired
    private FelinService felinService;

    @GetMapping("/lion/cri")
    public String index() {
        return "ROAAARRR";
    }

    @PostMapping("/lion")
    public Lion creerLion(@RequestParam String couleur, @RequestParam int age) {
        return felinService.ajouterLion(couleur, age);
    }

    @GetMapping("/lion/{id}")
    public Lion recupererLion(@PathVariable int id) {
        return felinService.getLion(id);
    }
}