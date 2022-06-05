/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_finality;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AngieFr
 */
public class EVA3_10_FINALITY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner input = new Scanner (System.in);
            System.out.println("Intorduce un dato entero:  ");
            int valor = input.nextInt();
            System.out.println("El valor es : " + valor);
            }catch(InputMismatchException e){
                e.printStackTrace();
            }finally{
    System.out.println("Esta linea siempre se ejecuta");
}
        System.out.println("fin del programa");
}        
}