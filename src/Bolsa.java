/*
 * Fecha de creación: 10 de octubre de 2022
 * Fecha de actualización: 11 de octubre de 2022
 * Autor(es): Fuentes Alvarado Oscar
 * 			: Martínez Miguel Nancy Obed
 * Descripción: Clase genérica para almacenar elementos sin considerar el tipo que sea 
 */

import java.util.ArrayList;

public class Bolsa<T> {
	//Declaración de un arraylist de tipo genérico para almacenar los datos recibidos
	private ArrayList<T> lista = new ArrayList<T>();
	
	//Método para añadir elementos a la lista
	public void add(T objeto) {
		lista.add(objeto);
	}
	
	//Método que retorna una lista de elementos tipo (T)
	public ArrayList<T> getProducts() {
		return lista;
	}
}
