package com.example.solid.violacao;

public class Quadrado extends Retangulo{


    public Quadrado(double base, double altura) {
        super(base, altura);
    }

    @Override
    public Double area() throws Exception {
        if(super.getBase() == super.getAltura()) {
            return super.getBase()*super.getAltura();
        }else throw new Exception("Não é um quadrado!");
    }

}
