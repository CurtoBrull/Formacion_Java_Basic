package com.mg.web;

import com.mg.domain.Persona;
import com.mg.servicio.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Slf4j
public class ControladorInicio {

	//	Inyectar interface PersonaDao
	@Autowired
	private PersonaService personaService;

	@GetMapping("/")
	public String inicio(Model model, @AuthenticationPrincipal User user) {
		var personas = personaService.listarPersonas();
		log.info("usuario que hizo login: " + user);
		log.info("ejecutando el controlador Spring MVC");
		model.addAttribute("personas", personas);
		return "index";
	}

	//	Recojemos el objeto persona del formulario
	@GetMapping("/agregar")
	public String agregar(Persona persona) {
		return "modificar";
	}

	@PostMapping("/guardar")
	public String guardar(@Valid Persona persona, Errors errores) {

		if (errores.hasErrors()) {
			return "modificar";
		}

		personaService.guardar(persona);
		return "redirect:/";
	}

	@GetMapping("/editar/{idPersona}")
	public String editar(Persona persona, Model model) {
		persona = personaService.encontrarPersona(persona);
		model.addAttribute("persona", persona);
		return "modificar";
	}

//	Con QueryParam se pasa un parámetro directamente de la url
	@GetMapping("/eliminar")
	public String eliminar(Persona persona) {
		personaService.eliminar(persona);
		return "redirect:/";
	}

}
