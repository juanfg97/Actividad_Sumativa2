package figurasg;

public class Cuadrado extends FigurasGeometricas {
// se declaran variables
private double lado1;
private double lado2;
public Cuadrado(double lado1, double lado2) {
	
	this.lado1 = lado1;
	this.lado2 = lado2;
}
public double CalcularArea() {
	return lado1*lado2;
}
public double CalcularPerimetro() {
	return 2*(lado1+lado2);
}


}
