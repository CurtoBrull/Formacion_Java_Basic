package modelos;

import java.util.Objects;

public class Matricula {

	private long id;
	private long asignatura_id;
	private int year;
	private Integer nota = null;

	public Matricula(long id, long asignatura_id, int year, Integer nota) {
		this.id = id;
		this.asignatura_id = asignatura_id;
		this.year = year;
		this.nota = nota;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAsignatura_id() {
		return asignatura_id;
	}

	public void setAsignatura_id(long asignatura_id) {
		this.asignatura_id = asignatura_id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Matricula matricula = (Matricula) o;
		return id == matricula.id && asignatura_id == matricula.asignatura_id && year == matricula.year && Objects.equals(nota, matricula.nota);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, asignatura_id, year, nota);
	}

	@Override
	public String toString() {
		return "Matricula{" +
				"id=" + id +
				", asignatura_id=" + asignatura_id +
				", year=" + year +
				", nota=" + nota +
				'}';
	}
}
