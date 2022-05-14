package com.example.solid.solucao;

public class Retangulo implements Quadrilatero{

    private Double altura, base;

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public Double area() {
        return altura*base;
    }
}
