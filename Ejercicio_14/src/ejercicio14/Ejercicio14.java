package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un número por favor:");
		
		double numero = entrada.nextDouble();
		
		double cuadrado = Math.pow(numero,2);
		double cubo = Math.pow(numero,3);
		
		System.out.print("El cuadrado del número ingresado es: " + cuadrado
				+ " y su cubo es: " + cubo);
		
		entrada.close();

	}

}
