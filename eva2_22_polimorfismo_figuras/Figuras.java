/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.eva2_22_polimorfismo_figuras;

/**
 *
 * @author eduar
 */
//NO SE PUEDEN INSTANCIAR
//SON COMO UN CONTRATO:
//SÓLO MÉTODOS ABSTRACTOS Y CONSTANTES
public interface Figuras {
    //todos los métodos en las interfaces son public abstract
    public abstract double calcularArea();
    double calcularPeri();
    
    
}
