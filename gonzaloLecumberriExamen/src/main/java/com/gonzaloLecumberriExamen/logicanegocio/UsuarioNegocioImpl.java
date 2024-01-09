package com.gonzaloLecumberriExamen.logicanegocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.gonzaloLecumberriExamen.accesodatos.DaoReceta;
import com.gonzaloLecumberriExamen.entidades.Receta;

@Component
@Primary
class UsuarioNegocioImpl implements UsuarioNegocio{
	
	@Autowired
	protected DaoReceta daoReceta;

	@Override
	public Iterable<Receta> listadoRecetas() {
		return daoReceta.obtenerTodos();
	}

}
