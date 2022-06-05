/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_20_escribir;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *
 * @author AngieFr
 */
public class EVA3_20_ESCRIBIR {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here
        Path ruta = Paths.get("C:\\Archivos/archi1.txt");
                OutputStream abrirArchivo;
                OutputStreamWriter escribirArh;
                BufferedWriter excribirtexto;
                try{
                abrirArchivo = Files.newOutputStream(ruta);
                escribirArh = new OutputStreamWriter(abrirArchivo);
                
                excribirtexto = new BufferedWriter(escribirArh);
                excribirtexto.write("Hola mundooo");
                excribirtexto.flush();
                excribirtexto.flush();
                excribirtexto.close();
                
                
                        
                
    }  
                catch(IOException ex){
                    ex.printStackTrace();
                }
    }
                
    
}