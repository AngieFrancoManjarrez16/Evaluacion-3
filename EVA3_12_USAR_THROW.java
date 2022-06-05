/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_usar_throw;

import java.util.Scanner;

/**
 *
 * @author AngieFr
 */
public class EVA3_12_USAR_THROW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        try{
        System.out.println("Introduce un valor entero positivo; ");
        int valor = entrada.nextInt();
        
        if(valor < 0)
            //throw sirve para generar una alternativa a las excepciones del sistema.
            //de esta manera generamos nuestros propios mecanismos de excpecion
            throw new Exception("El valor" + valor + " no es una edad valida!!");
             System.out.println("La edad ingresada es : " + valor);
        
    }catch(Exception e){
            e.printStackTrace();
}
       
    }
}