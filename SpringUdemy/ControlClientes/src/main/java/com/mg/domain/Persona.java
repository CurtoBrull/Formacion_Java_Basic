package com.mg.domain;

import lombok.Data;

import javax.persistence.*;
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
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
}
