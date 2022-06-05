/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_18_archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AngieFr
 */
public class EVA3_18_ARCHIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        FileInputStream archiv = new FileInputStream("Archivos/archi1.txt");    
        int caracter = archiv.read();
        
        while(caracter != -1){
            System.out.print((char)caracter);
            caracter = archiv.read();
        }
        
            System.out.println("");
        
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            
        }
    }
    
}
