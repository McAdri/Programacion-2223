package BucleFor;

public class Ejercicio08 {

	public static void main(String[] args) {
		// PRIMOS
		int numero = 8;
		int contador = 0;
		for(int i=2;i<numero;i++) {
			if(numero % 2 == 0) {
				contador++;
			}
		}
		
		if(contador == 0) {
			System.out.println("Ese numero es primo");
		} else {
			System.out.println("No es primo");
		}
	}

}
