package ejercicios;
//3.	Escribir un programa en Java que represente la clase cuenta bancaria, 
//la cuenta puede mostrar por pantalla los atributos de la cuenta, 
//consultar saldo, actualizar saldo, retirar un monto si el valor no supera el saldo actual.
import java.util.Scanner;
public class CuentaBancaria {
	//se declaran los atributos
private String Usuario;
private String Contraseña;
private double Saldo;

//Se crea un constructor 
	public CuentaBancaria(String Usuario , String Contraseña , double Saldo) 
	{
		this.Usuario=Usuario;
		this.Contraseña=Contraseña;
		this.Saldo=Saldo;
	}

// Se crea la funciones get y set para acceder a los atributos privados
	
	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getContraseña() {
		return Contraseña;
	}

	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	//Se crea metodo consultar saldo
	public void Consultarsaldo() 
	{
		System.out.println("Su saldo es "+ Saldo);
	}
	//Se crea metodo actualizar saldo
	public void Actualizarsaldo() {
		//Se inicia la clase Scanner
		Scanner read = new Scanner (System.in);
		System.out.println("Ingrese el saldo que desea depositar");
		double deposito;
		deposito=read.nextDouble();
		Saldo += deposito;
		System.out.println("Su saldo es "+ Saldo);
	}
	public void  Retirarsaldo() {
		//Se inicia la clase Scanner
		Scanner read = new Scanner (System.in);
		System.out.println("Ingrese el saldo a retirar");
		double retiro;
		retiro=read.nextDouble();
		if (Saldo >retiro ) {
			Saldo-=retiro;
			System.out.println("Su saldo es "+ Saldo);
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	public void  Salir() {
		System.out.println("Gracias por su visita");
	}
	
	public boolean  verificar(String Usuario,String Contraseña) {
		if (this.Usuario.equals(Usuario) && this.Contraseña.equals(Contraseña))
				{
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		
		//Se crea el objeto c1 (cuenta bancaria 1)
		CuentaBancaria c1 = new CuentaBancaria ("Juan","54321",1000);
		System.out.println("Bienvenido a Fernandez Bank");
		//Se declaran dos variables auxiliares para verificar datos
		String usuario1;
		String contraseña1;
		//Se inicia la clase Scanner
		Scanner read = new Scanner (System.in);
		//Se pide el usuario y contraseña
		System.out.println("Ingrese su usuario");
		usuario1=read.nextLine();
		System.out.println("Ingrese la contraseña");
		contraseña1=read.nextLine();
		// Se verifica el usuario y contrasena con sentencia If
		
		if (c1.verificar(usuario1, contraseña1)){
			//Se crea bucle while para que el menu se repita
			//Se crea una variable boleana para cancelar el bucle while
			Boolean continuar=true;
			while(continuar) {
				//Se crea sentencia switch para elegir el metodo que  se desea utilizar
				//Se pide un numero en funcion al metodo que se desee
			System.out.println("Seleccione una opccion");
			System.out.println("1.Consultar saldo");
			System.out.println("2.Actualizar saldo");
			System.out.println ("3.Retirar saldo");
			System.out.println("4.Salir");
			
			int opcion;
			opcion=read.nextInt();
			
			 
			switch(opcion) {
			case 1:
				c1.Consultarsaldo();
				break;
			case 2:
				c1.Actualizarsaldo();
				break;
			case 3:
				c1.Retirarsaldo();
				break;
			case 4:
				c1.Salir();
				continuar=false;
				break;
			default:
				System.out.println("No haz elegido una opcion del menu");
				break;
			}
			
			}
		}
		else {
			System.out.println("El usuario o contraseña son incorrectos");
		}
			
	}
}
