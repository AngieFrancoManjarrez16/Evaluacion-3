/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_division_0;

import java.util.Scanner;

/**
 *
 * @author AngieFr
 */
public class EVA3_3_DIVISION_0 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad en numero entero");
        int entero = input.nextInt();
        
        System.out.println("Introduce tu edad en numero entero 2");
        int entero2 = input.nextInt();
        
        System.out.println("Division: " + (entero/entero2));
        //excepciones sirven para evitar problemas en el prgrama
   
    }
    
}
