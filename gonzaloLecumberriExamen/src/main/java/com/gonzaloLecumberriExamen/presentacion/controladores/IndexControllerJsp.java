package com.gonzaloLecumberriExamen.presentacion.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gonzaloLecumberriExamen.logicanegocio.UsuarioNegocio;

@Controller
public class IndexControllerJsp {
	
	@Autowired
	private UsuarioNegocio user;
	
	@GetMapping("/")
	public String mostrarHolaJSP(Model modelo) {
		modelo.addAttribute("recetas", user.listadoRecetas());
		System.out.println(user.listadoRecetas());
		return "index";
	}
}
