package com.gonzaloLecumberriExamen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gonzaloLecumberriExamen.accesodatos.Dao;
import com.gonzaloLecumberriExamen.accesodatos.DaoReceta;
import com.gonzaloLecumberriExamen.entidades.Receta;

@SpringBootApplication
public class GonzaloLecumberriExamenApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GonzaloLecumberriExamenApplication.class, args);
	}

	@Autowired
	private DaoReceta dao;
	
	@Override
	public void run(String... args) throws Exception {
		for (Receta p : dao.obtenerTodos()) {
			System.out.println(p);
		}

	}

}
