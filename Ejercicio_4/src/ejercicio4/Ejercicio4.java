package ejercicio4;					

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner nombre = new Scanner(System.in);		// Se instancia la clase Scanner.
		System.out.println("Hola Juan, ¿Qué edad tienes?:");
		
		int edad_Juan = nombre.nextInt();	// Se usa la clase Scanner para recibir la edad de Juan y se almacena como un entero.
		
		int edad_Alberto = (int)(edad_Juan*((float)2/(float)3));	// Aunque los números 2/3 y 4/3 tienen decimales
																	// se hace una refundición de estas operaciones para
		int edad_Ana = (int)(edad_Juan*((float)4/(float)3));		// expresar la edad de cada hijo como un entero.
		
		int edad_mamá = edad_Juan + edad_Alberto + edad_Ana;
		
		System.out.println("la edad de Juan es: " + edad_Juan
				+ ", la edad de Alberto es: " + edad_Alberto		// Salida de datos.
				+ ", la edad de Ana es: " + edad_Ana
				+ ", la edad de la mamá de Juan es: " + edad_mamá);
		
		nombre.close();

	}

}
