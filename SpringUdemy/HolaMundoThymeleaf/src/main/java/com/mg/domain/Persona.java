package com.mg.domain;

import lombok.Data;

// Data de lombok agrega getters setters hash toString y constructores
@Data
public class Persona {

	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
}
