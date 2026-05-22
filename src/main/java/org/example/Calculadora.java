package org.example;

public class Calculadora {

    private double numero1;
    private double numero2;

    public Calculadora (double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double suma(){
        return numero1 + numero2;
    }

    public double resta(){
        return numero1 - numero2;
    }

    public double multiplicacion(){
        return numero1 * numero2;
    }


}
