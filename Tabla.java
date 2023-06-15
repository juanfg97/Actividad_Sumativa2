package ejercicios;
//2.	Escribir un programa en Java que genere la tabla de multiplicar y de dividir de un número que el usuario ingrese previamente.
//Por Juan Fernandez.Para Programacion 2-UBA
import java.util.Scanner;
public class Tabla {

	public static void main(String[] args) {
		//Se declaran variable
		double n;
//Se inicia la clase Scanner
		Scanner read = new Scanner (System.in);
		
//Se pide un numero
		System.out.println("Ingrese un numero");
		n=read.nextDouble();
//Se realiza  sentencias for para realizar las respectivas tablas 
		System.out.println("Tabla de multiplicar ");
		for(int i=1;i<=10;i++) {
			double multiplicacion = n*i;
			
			System.out.println("("+n+")"+"*"+i+"="+multiplicacion);
		}
		System.out.println("Tabla de dividir ");
		for(int j=1;j<=10;j++) {
			double division = n/j;
			
			System.out.println("("+n+")"+"/"+j+"="+division);
		}
		
	}

}
