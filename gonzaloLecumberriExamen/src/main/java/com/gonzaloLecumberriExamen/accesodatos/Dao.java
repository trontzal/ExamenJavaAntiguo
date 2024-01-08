package com.gonzaloLecumberriExamen.accesodatos;

public interface Dao<T> {
	Iterable<T> obtenerTodos();
	
	T insertar(T objecto);
	
	// Añadir mas opcional
}
