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
public class Persona{
    
    
    // ***** ATRIBUTOS *****
    private String nombre;
    private String apellidos;
    private int edad;
    private double peso;
    private double altura;
    
    
    // ***** CONSTRUCTORES *****
    // Constructor de Persona.
    public Persona (String nombre, String apellidos, int edad, double peso, double altura)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    
    /*public Persona (String nombre, String apellidos, int edad)
    {
        
        //this.nombre = nombre;
        //this.apellidos = apellidos;
        //this.edad = edad;
        this(nombre, apellidos, edad, 0.0, 0.0);
    }
    */

    // ***** METODOS *****
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso=peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
