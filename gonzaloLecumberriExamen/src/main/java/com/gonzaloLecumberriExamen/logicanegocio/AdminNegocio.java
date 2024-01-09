package com.gonzaloLecumberriExamen.logicanegocio;

import com.gonzaloLecumberriExamen.entidades.Receta;

public interface AdminNegocio extends UsuarioNegocio{

	Receta insertarReceta(Receta receta);
	
}
