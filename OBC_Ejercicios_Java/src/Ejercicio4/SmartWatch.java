package Ejercicio4;

public class SmartWatch extends SmartDevice{

	double peso;

	public SmartWatch(){
	}

	public SmartWatch(String marca, String modelo, int RAM, int almacenamiento, int bateria, double peso){
        super(marca, modelo, RAM, almacenamiento, bateria);
		this.peso = peso;
    }

	@Override
	public String toString() {
		return "SmartWatch{" +
				"peso=" + peso +
				", marca='" + marca + '\'' +
				", modelo='" + modelo + '\'' +
				", RAM=" + RAM +
				", almacenamiento=" + almacenamiento +
				", bateria=" + bateria +
				'}';
	}
}
