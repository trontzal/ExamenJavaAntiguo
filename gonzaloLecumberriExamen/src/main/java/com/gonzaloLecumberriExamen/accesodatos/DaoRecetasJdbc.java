package com.gonzaloLecumberriExamen.accesodatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.gonzaloLecumberriExamen.entidades.Receta;

@Component
class DaoRecetasJdbc implements DaoReceta {

	private static final String SQL_SELECT = "SELECT recetas.id, recetas.nombre, dificultades.dificultad as dificultad FROM recetas JOIN dificultades ON recetas.dificultad_id = dificultades.id";
	private static final String SQL_INSERT = "INSERT INTO recetas (nombre, dificultad_id) VALUES (?, ?)";

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public Iterable<Receta> obtenerTodos() {
		return jdbc.query(SQL_SELECT, new BeanPropertyRowMapper<Receta>(Receta.class));
	}

	@Override
	public Receta insertar(Receta receta) {
		jdbc.update(SQL_INSERT, receta.getNombre(), receta.getDificultad());
		return receta;
	}

}
