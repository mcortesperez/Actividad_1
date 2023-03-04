package ejercicio17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#.##");		/* Se usa el método DecimalFormat
															de la clase text para imprimir los 
															resultados de área y perímetro
															con 2 decimales significativos*/
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un valor para el radio del círculo en metros: ");
		double radio = entrada.nextDouble();
		
		String area = df.format(Math.PI*Math.pow(radio, 2));
		
		String longitud = df.format(2*Math.PI*radio);
		
		System.out.print("El área del circulo con radio " + radio
				+ "m es igual a: " + area
				+ " m². La longitud de la circunferencia que define su borde es: "
				+ longitud + " m.");
		
		entrada.close();

	}

}
