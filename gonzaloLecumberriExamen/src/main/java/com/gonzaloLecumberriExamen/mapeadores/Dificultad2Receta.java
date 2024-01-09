package com.gonzaloLecumberriExamen.mapeadores;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gonzaloLecumberriExamen.entidades.Dificultad;
import com.gonzaloLecumberriExamen.entidades.Receta;

// Mapeador personalizado para mostrar los datos de receta y dificultad juntos
public class Dificultad2Receta implements RowMapper<Receta>{

	@Override
	public Receta mapRow(ResultSet rs, int rowNum) throws SQLException {
		Receta receta = new Receta();
		receta.setId(rs.getLong("id"));
        receta.setNombre(rs.getString("nombre"));

        Dificultad dificultad = new Dificultad();
        dificultad.setDificultad(rs.getString("dificultad"));

        receta.setDificultad(dificultad);

        return receta;
	}
	
}
