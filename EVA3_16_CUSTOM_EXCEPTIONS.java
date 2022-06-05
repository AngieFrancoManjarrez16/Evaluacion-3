/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_16_custom_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AngieFr
 */
public class EVA3_16_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws exCaptura {
     Scanner spect = new Scanner(System.in);
        System.out.println("Ingresa edad");
        int valor = 0;
        try{
            valor = spect.nextInt();
        }catch(InputMismatchException ex){
            throw new exCaptura("Pusiste una cadena de texto");
        }

    }
}

class exCaptura extends Exception{

    public exCaptura() {
    }

    public exCaptura(String message) {
        super(message);
    }

}