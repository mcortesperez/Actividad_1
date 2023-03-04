package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double suma = 0;		// se inicializa la variable suma de tipo doble.
		
		System.out.println("Ingrese el valor de X: ");
		double X = entrada.nextDouble();			// se inicializa la variable X de tipo doble.
		
		System.out.println("Ingrese el valor de Y: ");
		double Y = entrada.nextDouble();			// se inicializa la variable Y de tipo doble.
		
		suma += X;				// se incrementa suma X veces.
		
		/* Las variables anteriores se eligieron de tipo doble para usar el método
		 * pow de la clase Math e imprimir al final el valor de suma con decimales
		 * correctamente. 
		 */
		
		X += (Math.pow(Y, 2)); 
		
		suma += (double)X/Y;
		
		System.out.println("La suma es: " + suma);
		
		entrada.close();
	}

}
