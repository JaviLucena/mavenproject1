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

public class Algoritmo
{
	static Objeto[] o;
	static List <Objeto> temporal;
        static int gananciaTemporal = 0;
	static int gananciaTotal = 0;
	
	// variable global donde la función 'calcular' dejará depositada la mochila con los objetos que componen el beneficio óptimo
	static Mochila optima = null;		
	
	static int capacidad = 150;

	public static void main(String args[])
	{
		o=new Objeto[10];
                temporal=new ArrayList();
		
		// El contenido de este array es modificable para poder probar distintos escenarios del problema
		o[0]=new Objeto(	50,	1000,	3);
		o[1]=new Objeto(	35,	700, 	7);
		o[2]=new Objeto(	78,	2000, 	1);
		o[3]=new Objeto(	58,	1400, 	4);
		o[4]=new Objeto(	28,	1100, 	2);
		o[5]=new Objeto(	32,	600, 	6);
		o[6]=new Objeto(	10,	350, 	3);
		o[7]=new Objeto(	9,	280, 	2);
		o[8]=new Objeto(	24,	650, 	2);
		o[9]=new Objeto(	80,	800, 	1);

		// Llamamos al algoritmo
		calcular (new Mochila(capacidad));
	
		// Variables para resultados
		 int cargaTotal = 0;
		 gananciaTotal = 0;
	
		for (int i=0; i<optima.getNumObjetos(); i++)
		{
			System.out.println("El objeto " + i + " es de tipo " + optima.getObjeto(i) );
			
			cargaTotal += optima.getObjeto(i).getPeso();
			gananciaTotal += optima.getObjeto(i).getBeneficio();
		}
		System.out.println("En total, el tren lleva un total de:");
		System.out.println("  - Carga: " + cargaTotal);
		System.out.println("  - Ganancias: " + gananciaTotal);
	
	}
	
	
	
	public static void calcular (Mochila m)
	{
            for (int i=0; i<o.length;i++){
                if(o[i].getUnidades()>0){
                    if(o[i].getPeso()<=m.getCapacidad()){
                        temporal.add(o[i]);
                        o[i].setUnidades(o[i].getUnidades()-1);
                        gananciaTemporal=+o[i].getBeneficio();
                        calcular(new Mochila(m.getCapacidad()-o[i].getPeso()));
                        temporal.remove(o[i]);
                        o[i].setUnidades(o[i].getUnidades()+1);
                        gananciaTemporal=-o[i].getBeneficio();
                    }
                }
            }
            if (gananciaTemporal>gananciaTotal){
                gananciaTotal=gananciaTemporal;
                if(optima.objetos==null){
                
                } else{
                  optima.objetos.clear();  
                }
                for(int j=0;j<temporal.size();j++){
                    optima.objetos.add(temporal.get(j));
                }
            }
            
		// rellenar por el alumno
	}
		
}