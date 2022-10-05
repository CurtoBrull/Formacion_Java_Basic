package Ejercicio4;

public class SmartDevice {

	String marca;
	String modelo;
	int RAM;
	int almacenamiento;
	int bateria;

	public SmartDevice() { }

	public SmartDevice(String marca, String modelo, int RAM, int almacenamiento, int bateria) {
		this.marca = marca;
        this.modelo = modelo;
        this.RAM = RAM;
        this.almacenamiento = almacenamiento;
		this.bateria = bateria;
	}

	@Override
	public String toString() {
		return "SmartDevice{" +
				"marca='" + marca + '\'' +
				", modelo='" + modelo + '\'' +
				", RAM=" + RAM +
				", almacenamiento=" + almacenamiento +
				", bateria=" + bateria +
				'}';
	}
}
