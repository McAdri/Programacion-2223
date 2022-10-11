package BucleDoWHile;

import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = -1;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Dme un numero: ");
			numero = teclado.nextInt();
		}while(numero<=0);
	}

}
