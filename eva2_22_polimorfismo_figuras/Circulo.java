/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_22_polimorfismo_figuras;

/**
 *
 * @author eduar
 */
public class Circulo implements Figuras, MostrarDatos{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = 20;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }

    @Override
    public double calcularPeri() {
        return Math.PI * (radio * 2);
    }
    
     @Override
    public void imprimirDatos() {
        System.out.println("Circulo");
        System.out.println("Radio: "+radio);
         System.out.println("AREA: "+calcularArea());
         System.out.println("PERIMETRO: "+calcularPeri());
    }
    
    
}
