package com.example.solid;

import com.example.solid.solucao.Quadrilatero;
import com.example.solid.violacao.Quadrado;
import com.example.solid.violacao.Retangulo;

public class HelloApplication {

    public static void main(String[] args) throws Exception {

        Retangulo retangulo = new Retangulo(10, 10);
        Retangulo quadrado = new Quadrado(10,10);

        System.out.println(quadrado.area());

        Quadrilatero [] quadrilatero = new Quadrilatero[2];

        quadrilatero[0] = new com.example.solid.solucao.Quadrado(10);
        quadrilatero[1] = new com.example.solid.solucao.Retangulo(9, 9);

        System.out.println(quadrilatero[0].area());
        System.out.println(quadrilatero[1].area());
    }
}