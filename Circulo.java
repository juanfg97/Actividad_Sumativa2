package figurasg;

public class Circulo extends FigurasGeometricas
{

	private double radio;
	
	public Circulo(double radio) {
		this.radio=radio;
		}
	public double CalcularArea() {
		
		double pi=3.14;
		
		return radio*radio*pi;
	}
	public double CalcularPerimetro() {
		double pi=3.14;
		return 2*radio*pi;
	}
}