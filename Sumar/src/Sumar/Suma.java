package Sumar;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		suma();
	}

	public static void suma() {
		int a,b, resultado;
		String respuesta="s";
		
		Scanner teclado =new Scanner(System.in);
		while (respuesta=="s"){
			System.out.println("Introduce un número positivo:");
			a=teclado.nextInt();
			System.out.println("linea insignificante");
			System.out.println("segunda linea sin sentido");
			
			System.out.println("Introduce otro número positivo:");
			
			b=teclado.nextInt();
			if ((a > 0) && (b >0)) {
				resultado= a+b;
				System.out.println("El resultado es " + resultado);
				
			}
			else {
				System.out.println("No son positivos");
			}
			System.out.println("¿Quieres seguir sumando? s/n");
			respuesta=teclado.next();
		}
		teclado.close();
		
		
	}
}
