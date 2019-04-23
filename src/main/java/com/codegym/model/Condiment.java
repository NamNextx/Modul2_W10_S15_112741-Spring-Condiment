package com.codegym.model;

import java.util.List;

public class Condiment {

    private String tomato;
    private String apple;
    private String mutap;

    public Condiment() {
    }

    public Condiment(String tomato, String apple, String mutap) {
        this.tomato = tomato;
        this.apple = apple;
        this.mutap = mutap;
    }

    public String getTomato() {
        return tomato;
    }

    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    public String getApple() {
        return apple;
    }

    public void setApple(String apple) {
        this.apple = apple;
    }

    public String getMutap() {
        return mutap;
    }

    public void setMutap(String mutap) {
        this.mutap = mutap;
    }
}
