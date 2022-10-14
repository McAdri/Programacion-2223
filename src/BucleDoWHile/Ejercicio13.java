package BucleDoWHile;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Suma digitos
		int numero = 4752;
		int total = 0;
		while(numero>0) {
			total += numero % 10;
			numero = numero / 10;
		}
		
		System.out.println("EL total es " + total);

	}

}
