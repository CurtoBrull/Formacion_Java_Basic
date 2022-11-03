package com.everis.repository.entity;

import javax.persistence.*;

@Entity
// Aquí se indica el nombre de la tabla @Table(name = "empleado") si no corresponde con la clase
@Table
public class Empleado {
		//	Id = Primary Key
		@Id
		@Column
		private Integer id;

		//		Not Null, longitud 30
		@Column(nullable = false, length = 30)
		private String nombre;

		@Column
		private String apellidos;

		public Empleado() {
		}

		public Empleado(Integer id, String nombre, String apellidos) {
				this.id = id;
				this.nombre = nombre;
				this.apellidos = apellidos;
		}

		public Integer getId() {
				return id;
		}

		public void setId(Integer id) {
				this.id = id;
		}

		public String getNombre() {
				return nombre;
		}

		public void setNombre(String nombre) {
				this.nombre = nombre;
		}

		public String getApellidos() {
				return apellidos;
		}

		public void setApellidos(String apellidos) {
				this.apellidos = apellidos;
		}
}
