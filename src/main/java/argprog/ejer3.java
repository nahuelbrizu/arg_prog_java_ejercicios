/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
toLowerCase()
Retorna la cadena en minúsculas
toUpperCase()
Retorna la cadena en mayúsculas
*/
package argprog;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("escribe una frase con MAYUS y minus = ");
        String frase = scan.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
    }
}
