/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject;

/**
 *
 * @author 
 * Cristian Mato Huertas
 * Juan Jesús Blanco Bautista
 * Jorge Alcadie García
 */
public class Directivo extends Persona {
    
    
    // ***** ATRIBUTOS *****
    private String cargo;
    
    
    // ***** CONTRUCTORES *****
    // Constructor de directivo.
    public Directivo(String nombre, String apellidos, int edad, double peso, double altura, String cargo)
    {
        super(nombre, apellidos, edad, peso, altura);   //Llamada al constructor padre.
        this.cargo = cargo;
    }
    
    /*public Directivo(String nombre, String apellidos, int edad, String cargo)
    {
        this(nombre, apellidos, edad, 0.0, 0.0, cargo);
    }
    
    public Directivo(Persona persona, String cargo)
    {
        super(persona.getNombre(), persona.getApellidos(), persona.getEdad(), 0.0, 0.0);
        this.cargo = cargo;
    }
    */
    
    // ***** METODOS *****
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
