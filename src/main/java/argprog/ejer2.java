/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
*/
package argprog;

import java.util.Scanner;

/**
 *
 * @author emiliano
 */
public class ejer2 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        
        System.out.print("tu nombre es ? = ");
        String nombre = sca.nextLine();
        
        System.out.println(nombre);
        
    }
}
