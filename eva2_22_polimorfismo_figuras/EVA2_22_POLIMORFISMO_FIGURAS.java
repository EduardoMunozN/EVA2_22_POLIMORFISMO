/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_22_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {

    public static void main(String[] args) {
        //Circulo circu = new Circulo (20);
        //circu.imprimirDatos();
        
        //Figuras figu = circu;
        //System.out.println("ÁREA: "+figu.calcularArea());
        
        //ARREGLOS
        //int a[], b, c, d (solo el a tiene arreglo).
        //int [] datos = new int [10];
        
        //Circulo [] circu = new Circulo [10];
        //un arreglo en Java va de la posición 0 a la N-1.
        //N es la cantidad de elementos del arreglo
        //0 al 9
        
        //circu [0] = new Circulo();
        //circu[0].calcularArea();
        //for (int i = 0; i < circu.length; i++) {
          //circu[i] = new Circulo(5);//CREAMOS CADA UNO DE LOS OBJETOS
            //circu[i].imprimirDatos();
            
       Figuras [] figuras;//declaramos un arreglo, pero no lo hemos creado.
       
       //Con el Scanner capturamos lo que el usuario introduzca en el teclado.
       Scanner input = new Scanner(System.in);
        System.out.println("¿Cuántas figuras quieres capturar?");
        
        //Nos permite capturar.
        int cant = input.nextInt();
        
        //Creamos el arreglo.
        figuras = new Figuras[cant];
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Captura el tipo de figura: ");
            System.out.println("1. Circulo, 2. Triángulo");
            int figu = input.nextInt();
            if(figu ==1){//Círculo
                //figuras[i] = new Circulo();
                Circulo circu = new Circulo();
                System.out.println("INTRODUCE EL RADIO: ");
                circu.setRadio(input.nextDouble());
                figuras[i] = circu;
                
                
                
            }else{//Triángulo
                //figuras[i]= new Triángulo();
                Triángulo triangulo = new Triángulo();
                System.out.println("INTRODUCE LA BASE: ");
                triangulo.setBase(input.nextDouble());
                
                System.out.println("INTRODUCE LA ALTURA: ");
                triangulo.setAltura(input.nextDouble());
                
                figuras [i]= triangulo;
            }
                    
            
        }
        //IMPRIMIR LOS RESULTADOS
        for (int i = 0; i < figuras.length; i++) {
            
            if(figuras[i] instanceof Circulo){
                System.out.println("CIRCULO");
                Circulo circu = (Circulo)figuras[i];//casting
                circu.imprimirDatos();
            }else
                System.out.println("TRIÁNGULO");
            Triángulo triangulo = (Triángulo)figuras[i];//casting
            triangulo.imprimirDatos();
            
        }
        }
    }


