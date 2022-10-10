package modelos;

import java.util.Objects;

public class Profesores {

	private Long id = null;

	private String nombre = null;

	private String apellidos = null;

	public Profesores(Long id, String nombre, String apellidos) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Profesores that = (Profesores) o;
		return id.equals(that.id) && nombre.equals(that.nombre) && apellidos.equals(that.apellidos);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, apellidos);
	}

	@Override
	public String toString() {
		return "Profesores{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				", apellidos='" + apellidos + '\'' +
				'}';
	}
}
