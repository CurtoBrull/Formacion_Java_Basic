package POO_Platzi.model;


import lombok.Setter;


public class Nurse extends User {

	@Setter
	private String speciality;

	public Nurse(String name, String email) {
		super(name, email);
	}

	@Override
	public void showDataUser() {
		System.out.println("Empleado Hospital: Mediterráneo");
		System.out.println("Departamento: Recepción");
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


}
