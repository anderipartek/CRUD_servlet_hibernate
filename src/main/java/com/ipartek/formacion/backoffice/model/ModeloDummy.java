
package com.ipartek.formacion.backoffice.model;

import java.util.ArrayList;

import com.ipartek.formacion.backoffice.pojo.Pelicula;

public class ModeloDummy {
	
	private static ArrayList<Pelicula> peliculas = null;
	
	public static ArrayList<Pelicula> getAll(){
		
		peliculas = new ArrayList<Pelicula>();
		Pelicula p;
		for (int i=0; i < 50; i++){
			p = new Pelicula("titulo "+i);
			p.setId(i);
			peliculas.add(p);
		}
		return peliculas;
	};
	
	
	public static Pelicula getById(int posicion){
		return peliculas.get(posicion);
	}
	
}
