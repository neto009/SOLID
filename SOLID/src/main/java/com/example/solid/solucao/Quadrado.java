package com.example.solid.solucao;

public class Quadrado implements Quadrilatero{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public Double area() {
        return lado*lado;
    }
}
