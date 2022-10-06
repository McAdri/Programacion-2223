package bucleWhile;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Numeros postivos
		int numero = -1;
		Scanner teclado = new Scanner(System.in);
		while(numero < 1) {
			System.out.print("Dme un numero: ");
			numero = teclado.nextInt();
		}
	}

}
