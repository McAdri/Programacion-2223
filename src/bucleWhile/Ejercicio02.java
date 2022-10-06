package bucleWhile;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Nota
		Scanner teclado = new Scanner(System.in);
		int nota = -1;
		while(nota < 0 || nota >10) {
			System.out.print("Dime la nota: ");
			nota = teclado.nextInt();
		}

	}

}
