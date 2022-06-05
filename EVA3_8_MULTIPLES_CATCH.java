/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_multiples_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AngieFr
 */
public class EVA3_8_MULTIPLES_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        try{    
        System.out.println("introduce un numero entero 1:");
        int entero = input.nextInt();
        System.out.println("introduce el numero entero 2:");
        int entero2 = input.nextInt();
        System.out.println("Division: " + (entero/entero2));
    } catch (ArithmeticException miVariable){
        //miVariable.printStackTrace(); //imprime la excepcion sin que el programa
        System.out.println("se produjo una division entre cero");
    }catch(InputMismatchException e){
                System.out.println("el valor capturado no es numero valido");

    }
            System.out.println("fin del programa");

    }
}