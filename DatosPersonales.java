package ejercicios;
//1.	Escribir un programa en Java que solicite el nombre de usuario y contraseña de un vendedor y, además, la verifique.
//Por Juan Fernandez. Para Programacion 2-UBA
import java.util.Scanner;
public class DatosPersonales {
public static void main(String[] args) {
	
		//Se declaran las variables 
	    String usuario;
	    String contraseña;
	
	    //Se inicia la clase java
	    Scanner read = new Scanner (System.in);
	    //Se piden el usuario y contraseña   
	    System.out.println("Ingrese su nombre de usuario");
	    
	    usuario=read.nextLine();
	    
	    System.out.println("Ingrese su contraseña");
	    
	    contraseña= read.nextLine();
	    // Se declara la variable u (usuario) y la variable c (contraseña) , estas variables representan el usuario y contraseña 
	    //que el vendedor creo inicialmente 
	    
	    String u="usuario";
	    String c="12345";
	   
	    //Se utiliza la sentencia If para verificar que los datos usuario y contraseña solicitados son exactamente iguales a 
	    //el usuario y contraseña que el vendedor establecio inicialmente en sistema
	    
	    if ( usuario.equals(u) && contraseña.equals(c))
	    {
			System.out.println("Los datos ingresados son correctos");
		}
		else 
		{
			System.out.print("El usuario o contraseña es incorrecto");
		}

	}
}
		