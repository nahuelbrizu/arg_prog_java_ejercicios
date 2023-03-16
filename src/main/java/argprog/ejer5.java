/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




package argprog;

import java.util.Scanner;

/**
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
*/
public class ejer5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    int num = sc.nextInt();

    int doble = num * 2;
    int triple = num * 3;
    double raizCuadrada = Math.sqrt(num);

    System.out.println("El doble de " + num + " es: " + doble);
    System.out.println("El triple de " + num + " es: " + triple);
    System.out.println("La raíz cuadrada de " + num + " es: " + raizCuadrada);
    }
}
