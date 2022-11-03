package com.mg;

import com.mg.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class ControladorInicio {

//	Buscar el valor de la propiedad "index.saludo" en el archivo application.properties
//	@Value("${index.saludo}")
	private String saludo;


	@GetMapping("/")
	public String inicio(Model model) {

		var mensaje = "Hola Mundo con Thymeleaf";

		var persona = new Persona();
		persona.setNombre("Juan");
		persona.setApellido("Perez");
		persona.setEmail("email@email.com");
		persona.setTelefono("123456789");

		var persona2 = new Persona();
		persona2.setNombre("Loli");
		persona2.setApellido("Adamuz");
		persona2.setEmail("email2@email.com");
		persona2.setTelefono("167324289");

		List<Persona> personas = new ArrayList<>();
		personas.add(persona);
		personas.add(persona2);

		log.info("Ejecutando el controlador Spring MVC");
		model.addAttribute("mensaje", mensaje);
//		model.addAttribute("saludo", saludo);
		model.addAttribute("persona", persona);
		model.addAttribute("persona", persona2);
		model.addAttribute("personas", personas);
		return "index";
	}
}
