/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_22_polimorfismo_figuras;

/**
 *
 * @author eduar
 */
public class Triángulo implements Figuras, MostrarDatos{
    private double base;
    private double altura;

    public Triángulo() {
    }

    public Triángulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularPeri() {
        double hip = Math.hypot(base, altura);
        return base + altura + hip;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Triángulo");
        System.out.println("Altura: "+altura);
        System.out.println("Base: "+base);
        System.out.println("AREA: "+calcularArea());
        System.out.println("PERIMETRO: "+calcularPeri());
        
    }
    
    
}
