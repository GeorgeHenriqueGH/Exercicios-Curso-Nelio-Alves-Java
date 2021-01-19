package entities;

public class Retangulo {

	public double x;
	public double y;

	public double area() {
		return x * y;
	}

	public double perimetro() {
		return 2 * (x + y);
	}

	public double diagonal() {
		return Math.sqrt(x * x + y * y);
	}

}