package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tigre implements Felin {

    @Id
    private int id;
    private String couleur;
    private int age;

    private static int compteur = 1;

    public Tigre() {
    }

    public Tigre(String couleur, int age) {
        this.id = compteur;
        compteur++;
        this.couleur = couleur;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void courir(boolean cours) {
        System.out.println("Le tigre court");
    }

    @Override
    public void manger(boolean mange) {
        System.out.println("Le tigre mange");
    }

    @Override
    public void dormir(boolean dors) {
        System.out.println("Le tigre dort");
    }
}