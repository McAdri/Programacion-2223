package BucleFor;

public class Ejercicio11 {

	public static void main(String[] args) {
		// POTENCIA
		int base = 2;
		int exponente = 10;
		
		int resultado = 1;
		for(int i = 0;i<exponente;i++) {
			resultado *= base;
		}
		
		System.out.println("EL resultado es " + resultado);

	}

}
