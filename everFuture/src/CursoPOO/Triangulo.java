package CursoPOO;

public class Triangulo extends Geometria {

	static int numTriangulos = 0;
	protected double x, y, z;

	//	Constructores
	public Triangulo(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		numTriangulos++;
	}

	@Override
	public double perimetro() {
		return 0;
	}

	@Override
	public double area() {
		return 0;
	}
}
