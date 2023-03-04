package ejercicio5;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		double suma = 0;		// se inicializa la variable suma de tipo doble.
		
		double X = 20;			// se inicializa la variable X de tipo doble.
		
		suma += X;				// se incrementa suma X veces.
		
		int Y = 40;				// se inicializa la variable Y de tipo doble.
		
		/* Las variables anteriores se eligieron de tipo doble para usar el método
		 * pow de la clase Math e imprimir al final el valor de suma con decimales
		 * correctamente. 
		 */
		
		X += (Math.pow(Y, 2)); 
		
		suma += (double)X/Y;
		
		System.out.println("La suma es: " + suma);
	}

}
