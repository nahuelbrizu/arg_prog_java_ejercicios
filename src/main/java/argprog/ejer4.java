/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/


package argprog;

import java.util.Scanner;


public class ejer4 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("cuantos grados° hace? = ");
        int grados = scan.nextInt();
        int fahr = 32 + (9 * grados /5);
        
        System.out.println("La conversion de " + grados + " grados celcius a fahrenheit se ha realizado con exito ");
        System.out.println(" " + fahr + "° fahrenheit");
        
    }

    
}
