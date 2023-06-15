package figurasg;

public class Rectangulo extends FigurasGeometricas {
private double base;
private double altura;
public Rectangulo(double base, double altura) {
	
	this.base = base;
	this.altura = altura;
}
public double CalcularArea() {
	return base*altura;
}
public double CalcularPerimetro () {
	return 2*(base+altura);
}


}