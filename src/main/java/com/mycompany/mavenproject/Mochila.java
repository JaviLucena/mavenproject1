/*********************************************************************
Nombre: 
Expediente/titulación: 
Nombre:
Expediente/titulación: 
Nombre:
Expediente/titulación: 
*********************************************************************/

package com.mycompany.mavenproject;

import java.util.ArrayList;
import java.util.List;

public class Mochila
{
	List <Objeto> objetos = new ArrayList();	// Objetos contenidos en esta Mochila
	
	int capacidad;						// Máxima cantidad de objetos que admite
	
        
        
	// rellenar por el alumno

    public Mochila(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumObjetos() {
        int i=0;
        i=objetos.size();
        return i;
     }
    
    public Objeto getObjeto(int posicion){
        return objetos.get(posicion);
    }

    public int getCapacidad() {
        return capacidad;
    }
    
   /* public void setObjetos(Objeto[] obj){
        objetos=new Objeto[obj.length];
        System.arraycopy(obj, 0, objetos, 0, obj.length);
    }*/
    
    
    
}
