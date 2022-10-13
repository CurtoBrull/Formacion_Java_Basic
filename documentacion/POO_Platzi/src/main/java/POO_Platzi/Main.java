package POO_Platzi;


import POO_Platzi.model.Doctor;
import POO_Platzi.model.ISchedulable;
import POO_Platzi.model.User;

import java.util.Date;

public class Main {
	public static void main(String[] args) {

		//showMenu();

		Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatric");
		myDoctor.addAvailableAppointment(new Date(), "4pm");
		myDoctor.addAvailableAppointment(new Date(), "10am");
		myDoctor.addAvailableAppointment(new Date(), "1pm");

		System.out.println("--------------");
		User user = new Doctor("Anahí Salgado", "Pediatric");
		user.showDataUser();
		System.out.println("-------TEST-------");

//		Anónima
		User user1 = new User("Anahí Salgado", "email@email.com") {
			@Override
			public void showDataUser() {
				System.out.println("Doctor");
				System.out.println("Hospital: Cruz Verde");
				System.out.println("Departamento: Pediatria");
			}
		};

		user1.showDataUser();
		System.out.println("--------------");

		ISchedulable ISchedulable = new ISchedulable() {
			@Override
			public void schedule(Date date, String time) {

			}
		};

		ISchedulable.schedule(new Date(), "1pm");

//		for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
//			System.out.println(aA.getDate() + " " + aA.getTime());
//		}
//
//
//		System.out.println();
//		System.out.println();
//		Patient patient = new Patient("Alejandra", "alejandra@mail.com");
//		Patient patient2 = new Patient("Anahi", "anahi@mail.com");
//
//		System.out.println(patient.getName());
//		System.out.println(patient2.getName());
//		patient2 = patient;
//
//		System.out.println(patient.getName());
//		System.out.println(patient2.getName());
//
//		patient2.setName("Manuel");
//		System.out.println(patient);
//		System.out.println(patient2);


	}
}
