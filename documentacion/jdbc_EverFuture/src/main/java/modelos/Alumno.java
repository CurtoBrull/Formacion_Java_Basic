package modelos;

import java.util.Date;
import java.util.Objects;

public class Alumno {

	private Long id = null;
	private String nombre = null;
	private String apellidos = null;
	private Date fecha_nacimiento = null;

	public Alumno(Long id, String nombre, String apellidos, Date fecha_nacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
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

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	@Override
	public String toString() {
		return "Alumno{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				", apellidos='" + apellidos + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;
		
		Alumno alumno = (Alumno) o;
		return id.equals(alumno.id) && nombre.equals(alumno.nombre) && apellidos.equals(alumno.apellidos) && fecha_nacimiento.equals(alumno.fecha_nacimiento);
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 97 * hash + Objects.hashCode(this.id);
		hash = 97 * hash + Objects.hashCode(this.nombre);
		hash = 97 * hash + Objects.hashCode(this.apellidos);
		hash = 97 * hash + Objects.hashCode(this.fecha_nacimiento);
		return hash;
	}
}
