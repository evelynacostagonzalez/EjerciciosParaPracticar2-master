package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Ejercicio 1

        Escribir un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no.
        Solución
        */
        int edad;
        Scanner scan= new Scanner(System.in);
        System.out.println("¿Qué edad tienes?");
        edad = scan.nextInt();

        if (edad>=18) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("No eres mayor de edad");
        }
    }
}
