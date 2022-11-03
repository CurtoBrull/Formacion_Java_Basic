package com.cursojava.SpringFundamentos.controller;

import com.cursojava.SpringFundamentos.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

	@RequestMapping("/usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("Javier");
		usuario.setApellido("Curto");
		usuario.setEmail("email@email.com");
		usuario.setTelefono("123456789");
		usuario.setPassword("123456");
		return usuario;
	}

	@RequestMapping("/usuario/11")
	public Usuario editar() {
		Usuario usuario = new Usuario(1L, "Javier", "Curto", "email@email.com" , "123456789", "123456");
		return usuario;
	}

	@RequestMapping("/usuario/2")
	public Usuario eliminar() {
		Usuario usuario = new Usuario(1L, "Javier", "Curto", "email@email.com" , "123456789", "123456");
		return usuario;
	}

	@RequestMapping("/usuario/3")
	public Usuario buscar() {
		Usuario usuario = new Usuario(1L, "Javier", "Curto", "email@email.com" , "123456789", "123456");
		return usuario;
	}



}
