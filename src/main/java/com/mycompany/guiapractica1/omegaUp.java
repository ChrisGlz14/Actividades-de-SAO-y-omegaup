/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guiapractica1;

import java.util.Scanner;

/**
 *
 * @author ChrisPC
 */
public class omegaUp {

    /**
     Descripción
        Te gustan mucho las matemáticas pero no eres muy rápido haciendo los cálculos 
        manualmente. Como estás aprendiendo a programar, crees que podrías solucionar este problema 
        haciendo un programa que sea capaz de evaluar rápidamente ciertas expresiones aritméticas. 
        Para probar tus habilidades, has dedicido escribir un programa que evalúe una fórmula que
        tú inventaste
        Los valores z , y , x deben ser entre 0 y 1000
     
     */
    public static void main(String[] args) {
       //Variables tambien se podrian definir con Scanner para ingresar numeros.
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de X: ");
        double x = entrada.nextDouble();
        System.out.print("Ingrese el valor de Y: ");
        double y = entrada.nextDouble();
        System.out.print("Ingrese el valor de Z: ");
        double z = entrada.nextDouble();
        
        //Constante PI 
        double pi = Math.PI;
        
        //Operaciones Arriba (numerador)
        double cuadrado = z*z + y;
        double resultadoArriba = cuadrado * x + x;
        
        //System.out.println(resultadoArriba);
        
        //Operaciones Abajo (denominador)
        double resultadoAbajo = (x + pi) * (y +pi);
        
        System.out.println(resultadoArriba / resultadoAbajo);
        
        
  }
    
}
