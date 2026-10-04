package com.example.demo.Service;

import com.example.demo.Chat;
import com.example.demo.Lion;
import com.example.demo.Tigre;
import com.example.demo.Repository.ChatRepository;
import com.example.demo.Repository.LionRepository;
import com.example.demo.Repository.TigreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FelinService {

    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private LionRepository lionRepository;

    @Autowired
    private TigreRepository tigreRepository;

    // Chat
    public Chat ajouterChat(String couleur, int age) {
        Chat chat = new Chat(couleur, age);
        return chatRepository.save(chat);
    }

    public Chat getChat(int id) {
        return chatRepository.findById(id).orElse(null);
    }

    // Lion
    public Lion ajouterLion(String couleur, int age) {
        Lion lion = new Lion(couleur, age);
        return lionRepository.save(lion);
    }

    public Lion getLion(int id) {
        return lionRepository.findById(id).orElse(null);
    }

    // Tigre
    public Tigre ajouterTigre(String couleur, int age) {
        Tigre tigre = new Tigre(couleur, age);
        return tigreRepository.save(tigre);
    }

    public Tigre getTigre(int id) {
        return tigreRepository.findById(id).orElse(null);
    }
}
