package figurasg;
//4.	Escribir un programa en Java que considerando las siguientes figuras geométricas: círculo, rectángulo,
//cuadrado y triángulo. Se requiere los métodos para determinar el área y el perímetro de cada figura. 
//Además, para el triángulo y el rectángulo se requiere: un método para determinar qué tipo de triángulo.
//Se debe desarrollar una clase de prueba con un método main para crear las cuatro figuras y probar los métodos respectivos. 
//Por Juan Fernandez . Para Programacion 2 - UBA
public class Prueba {

	public static void main(String[] args) {
		//Se crea un circulo
	FigurasGeometricas Circulo = new Circulo(5);
	System.out.println("CIRCULO:");
	System.out.println("Area: "+ Circulo.CalcularArea()+" metros cuadrados");
	System.out.println("Perimetro: "+ Circulo.CalcularPerimetro()+" metros");
	System.out.println();
	//se crea un rectangulo
	FigurasGeometricas Rectangulo = new Rectangulo (4,6);
	System.out.println("RECTANGULO: ");
	System.out.println("Area: "+ Rectangulo.CalcularArea()+" metros cuadrados");
	System.out.println("Perimetro: "+Rectangulo.CalcularPerimetro()+" metros");
	System.out.println();
	//Se crea un cuadro
	FigurasGeometricas Cuadrado = new Cuadrado (2,2);
	System.out.println("CUADRADO:");
	System.out.println("Area:" + Cuadrado.CalcularArea()+" metros cuadrados");
	System.out.print("Perimetro: "+ Cuadrado.CalcularPerimetro()+" metros");
	System.out.println();
	System.out.println();
	//Se crea un triangulo
	FigurasGeometricas Triangulo = new Triangulo (1.5,3,3,2,2);
	System.out.println("TRIANGULO:");
	System.out.println("Area: "+ Triangulo.CalcularArea()+" metros cuadrados");
	System.out.println("Perimetro: "+Triangulo.CalcularPerimetro()+ " metros");
	System.out.println("Tipo: "+ ((Triangulo)Triangulo).Tipo());
	System.out.println();
	
	
	}

}
