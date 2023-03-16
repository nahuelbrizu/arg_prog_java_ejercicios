/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package argprog;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" escribe 2 numeros para sumarlos :");
        int num1 = scan.nextInt();
        System.out.println(" escribe el segundo numero :");
        int num2 = scan.nextInt();
    
        System.out.print("la suma es : " );
        System.out.print( num1 + num2);
    
    }
}
