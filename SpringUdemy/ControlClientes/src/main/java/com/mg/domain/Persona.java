package com.mg.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

// Data de lombok agrega getters setters hash toString y constructores
@Data
@Entity
// Especificar la tabla por si da problemas con mayúsculas y minúsculas
@Table(name = "persona")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@Column(name = "id_persona")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersona;

//	Validaciones
	@NotEmpty
	private String nombre, apellido;

	@NotEmpty
	@Email
	private String email;

	private String telefono;
}
