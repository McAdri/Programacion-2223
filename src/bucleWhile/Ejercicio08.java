package bucleWhile;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Aleatorio
		int numeroAdivinar = (int) (Math.random()*11);
		System.out.println("El numero es " + numeroAdivinar);
		boolean acierta = false;
		int intentos = 0;
		
		while(intentos < 3 && !acierta) {
			Scanner teclado =new Scanner(System.in);
			System.out.print("Dime tu numero:" );
			int numeroUsuario = teclado.nextInt();
			if(numeroAdivinar == numeroUsuario) {
				System.out.println("Has ganado");
				acierta = true;
			} else if(numeroAdivinar > numeroUsuario){
				
				System.out.println("El numero es mayor");
			} else {
				System.out.println("El numero es menor");
			}
			intentos++;
		}
		System.out.println("Adios");
		
	}

}
