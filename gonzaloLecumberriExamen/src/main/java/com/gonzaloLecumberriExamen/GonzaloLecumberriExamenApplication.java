package com.gonzaloLecumberriExamen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gonzaloLecumberriExamen.accesodatos.Dao;
import com.gonzaloLecumberriExamen.accesodatos.DaoReceta;
import com.gonzaloLecumberriExamen.entidades.Receta;
import com.gonzaloLecumberriExamen.logicanegocio.AdminNegocio;
import com.gonzaloLecumberriExamen.logicanegocio.UsuarioNegocio;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class GonzaloLecumberriExamenApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GonzaloLecumberriExamenApplication.class, args);
	}

	@Autowired
	private  AdminNegocio admin;
	

	
	@Override
	public void run(String... args) throws Exception {
		Receta nuevaReceta = Receta.builder().nombre("Bolognesa").dificultad("2").build();
		
//		admin.insertarReceta(nuevaReceta);
		
		for (Receta p : admin.listadoRecetas()) {
			System.out.println(p);
		}

	}

}
