package bucleWhile;

import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroAcertar = 7;
		int numeroUser= 7;
		while(numeroAcertar != numeroUser) {
			Scanner teclado = new Scanner(System.in);
			System.out.print("DIme un numero: ");
			numeroUser = teclado.nextInt();
			
		}
		System.out.println("ADIOS");
	}

}
