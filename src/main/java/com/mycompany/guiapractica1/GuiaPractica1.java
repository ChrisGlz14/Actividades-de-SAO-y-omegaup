/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapractica1;

import java.util.Scanner;

/**
 *
 * @author ChrisPC
 */
public class GuiaPractica1 {

    public static void main(String[] args) {
//        int uno = 6;
//        int dos = uno;
//        uno = 3;
//        
//        System.out.println("Valor de uno: " + uno);
//        System.out.println("Valor de dos: " + dos); 
//    

//        Ejercicio 2: Mensaje con variables

//        String nombre,ciudad,ocupacion,hobbie;
//        int edad = 25; 
//        int cumpleaños = 14 ; 
//        nombre = "Chris";
//        ciudad = "Santa Fe";
//        ocupacion = "Estudiante";
//        hobbie = "Jugar";
//        
//        System.out.println("Hola mi nombre es : "+ nombre + ". Mi cumpleaños es el " + cumpleaños + " de Septiembre. Ademas vivo en "+ ciudad + " donde me dedico a ser " + ocupacion +" y cuando tengo tiempo a "+ hobbie);

 
//        Ejercicio 3: Calculadora de edad
          Scanner scanner = new Scanner(System.in);
//          
//          int edad1,edad2, res;
//          System.out.println("Bienvenido a la  app para ver las diferencias de dias entre un año y otro");
//          System.out.println("Escriba una edad: ");
//          edad1 = scanner.nextInt();
//          System.out.println("Escriba otra edad: ");
//          edad2= scanner.nextInt();
//          
//          if(edad1<edad2) {
//              res = edad2 - edad1;
//          } else {
//              res= edad1 - edad2;
//          }
//          
//          System.out.println("La diferencia entre esas edades en dias es de: "+ res * 365);



//          Ejercicio 4: Suma de valores
//            int num1,num2,resultado;
//            
//            System.out.println("Bienvenido a la calculadora de sumas!");
//            System.out.println("Ingrese el Primer numero: ");
//            num1 = scanner.nextInt();
//            System.out.println("Ingrese segundo numero: ");
//            num2 = scanner.nextInt();
//            resultado = num1 + num2;
//            System.out.println("El Resultado es: "+ resultado);



//            Ejercicio 5 Calculador de abastecimiento de por vida
//              int edadActual,edadMaxima;
//              int semanas = 52;
//              System.out.println("Hola! Este es un calculador de cuantos snacks comeras en tu vida!");
//              System.out.println("Nombre de tu snack favorito: ");
//              String snack = scanner.nextLine();
//              System.out.println("Cuantos anios tienes? ");
//              edadActual = scanner.nextInt();
//              System.out.println("Cuantos años crees vivir?");
//              edadMaxima = scanner.nextInt();
//              System.out.println("Cuantos comeras a la semana???");
//              int cantidadSnackPorSemana = scanner.nextInt();
//              int operacionAniosFaltantes = edadMaxima - edadActual;
//              int operacionSemanasTotales = semanas * operacionAniosFaltantes;
//              int resultado = operacionSemanasTotales * cantidadSnackPorSemana;
//              int precioPorUnidad = 2295; 
//              int resultadoPrecio = precioPorUnidad * resultado;
//              
//              System.out.println("La cantidad de snacks " + snack +" que necesitaras por semana son: "+  resultado + ". Asi que tendras que ahorrar: $" + resultadoPrecio +" Pesos Argentinos");
//              
              

//              Ejercicio 7: Calculador de IMC
//                String nombre;
//                String prepaga;
//                int edad;
//                double peso,altura, indiceMasaCorporal, rangosIMC;
//                String estadoDelPaciente;
//                
//                System.out.println("Hola esta es una calculadora de Indice de masa corporal");
//                System.out.println("Porfavor ingrese su nombre: ");
//                nombre = scanner.nextLine();
//                
//                
//                System.out.println("Posee prepaga?");
//                prepaga = scanner.nextLine();
//                switch (prepaga) {
//            case "si":
//                System.out.println("Si Tiene prepaga");
//                break;
//            case "no":
//                System.out.println("No tiene prepaga");
//            }
//                
//                
//                System.out.println("Ingrese su edad: ");
//                edad = scanner.nextInt();
//                //Validacion de la edad
//                while (edad <= 0 || edad > 100) {                        
//                System.out.println("Ingrese un valor valido");
//                edad = scanner.nextInt();
//                }
//                
//                
//                
//                System.out.println("Ingrese su altura: ");
//                altura = scanner.nextDouble();
//                //Validacion de altura
//                if(altura > 10) {
//                    altura = altura / 100;
//                    System.out.println(altura);
//                }
//                
//                System.out.println("Ingrese su peso: ");
//                peso = scanner.nextDouble();
//                
//                
//
//                indiceMasaCorporal = peso /(altura*altura);
//                
//                estadoDelPaciente = "En espera";
//                if (indiceMasaCorporal < 18.5){
//                    estadoDelPaciente = "Bajo Peso";
//                } else if (indiceMasaCorporal > 18.5 && indiceMasaCorporal < 24.9) { 
//                    estadoDelPaciente = "Normal";
//                } else if (indiceMasaCorporal > 24.9 && indiceMasaCorporal <29.9) {
//                    estadoDelPaciente =  "Sobrepeso";
//                } else if (indiceMasaCorporal > 29.9 && indiceMasaCorporal <34.9) {
//                    estadoDelPaciente = "Obesidad grado 1";
//                }
//                
//                
//                System.out.println("Posee prepaga: "+prepaga);
//                System.out.println("El IMC del paciente "+ nombre +" con una altura de: "+altura+" Metros, y peso de: "+ peso+ "Kg, es de: "+ indiceMasaCorporal);
//                System.out.println("El paciente tiene un grado de: "+ estadoDelPaciente);


 
        //Rango válido tipo short: -36768 a 32767
        //Rango válido tipo int: -2.147.483.648 a 2.147.483.647
        
        
        
        
        
        
        
        //Casting implícito
        short numeroShort1 = 32767; //32768
        System.out.println("numeroShort1: " + numeroShort1);
        
        int numeroInt1 = numeroShort1;
        System.out.println("Casting implicito a int: " + numeroInt1);
        
        //Casting explícito
        
        int numeroInt2 = 32768;
        System.out.println("numeroInt2: " + numeroInt2);
        
        short numeroShort2 = (short) numeroInt2;
        System.out.println("Casting explicito a short: " + numeroShort2);
        
        /*
        Cuando se convierte un número mayor que 32767 en un short, el número se desborda, 
        y se comporta como si "diera la vuelta" al rango del tipo de dato. 
        Por lo tanto, el valor 32768 se convierte en -32768.
        */

    }
}
