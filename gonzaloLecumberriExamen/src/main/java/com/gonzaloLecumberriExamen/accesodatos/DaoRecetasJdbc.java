package com.gonzaloLecumberriExamen.accesodatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.gonzaloLecumberriExamen.entidades.Receta;

@Component
class DaoRecetasJdbc implements DaoReceta{
	
	private static final String SQL_SELECT = "SELECT * FROM recetas";
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public Iterable<Receta> obtenerTodos() {
		return jdbc.query(SQL_SELECT, new BeanPropertyRowMapper<Receta>(Receta.class));
	}

	@Override
	public Receta insertar(Receta objecto) {
		// TODO Auto-generated method stub
		return null;
	}

}
