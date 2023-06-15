package figurasg;

public class Triangulo extends FigurasGeometricas {
	private double base;
	private double altura;
	private double lado1,lado2,lado3;
	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

public double CalcularArea() {
	return (base*altura)/2;
}

public double CalcularPerimetro() {
	return lado1+lado2+lado3;
}
public String Tipo() {
	if(lado1==lado2 && lado2==lado3) {
		return "Equilatero";
		
	}
	else if (lado1==lado2 || lado2==lado3 || lado1==lado3) {
		return "Isosceles";
	}
	else {
		return "Escaleno";
	}
}
}
