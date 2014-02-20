/*********************************************************************
Nombre: 
Expediente/titulación: 
Nombre:
Expediente/titulación: 
Nombre:
Expediente/titulación: 
*********************************************************************/

package com.mycompany.mavenproject;

public class Objeto
{
	int peso = 0;
	
	int beneficio = 0;
	
	int unidades = 0;
	
	// rellenar por el alumno

    public Objeto(int p,int b, int u) {
        peso=p;
        beneficio=b;
        unidades=u;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
}
