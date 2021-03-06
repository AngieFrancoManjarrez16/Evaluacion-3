/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_17_exception_rango;

/**
 *
 * @author AngieFr
 */
public class EVA3_17_EXCEPTION_RANGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Persona perso = new Persona("Ricardo Flores",18);
        } catch (ExcepcionDeRango ex) {
           ex.printStackTrace();
        }
     
    }
    
}

class ExcepcionDeRango extends Exception{

    public ExcepcionDeRango() {
    }

    public ExcepcionDeRango(String message) {
        super(message);
    }
    
}

class Persona {

    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) throws ExcepcionDeRango {
        this.nombre = nombre;
        setEdad(edad);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ExcepcionDeRango {
        if (edad >= 0 && edad <= 130) {
            this.edad = edad;
        } else {
            throw new ExcepcionDeRango("Edad en un rango inválido");
        }

    }

}