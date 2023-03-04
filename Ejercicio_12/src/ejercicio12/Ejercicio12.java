package ejercicio12;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		final int numero_horas = 48;
		final int valor_hora = 5000;
		
		float salario_bruto = numero_horas*valor_hora;
		float retencion = salario_bruto*0.125F;
		float salario_neto = salario_bruto-retencion;
		
		System.out.println("EL salario bruto del trabajador es de: $" + salario_bruto
				+ ", su retención en la fuente de: $" + retencion
				+ " y su salario neto es de: $" + salario_neto);
	}

}
