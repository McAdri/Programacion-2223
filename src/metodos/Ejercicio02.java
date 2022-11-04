package metodos;

import java.util.Scanner;

public class Ejercicio02 {

	
	private static int suma(int num1, int num2) {
		return num1 + num2;
	}
	
	private static int resta(int num1, int num2) {
		return num1 - num2;
	}
	
	private static int multi(int num1, int num2) {
		return num1 * num2;
	}
	
	private static int division(int num1, int num2) {
		return num1 / num2;
	}
	
	private static int leer(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(texto);
		return teclado.nextInt();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = leer("DIme elnumero 1: ");
		int numero2 = leer("DIme el numero 2: ");
		
		int opcion = leer("Que queires hacer pesao???");
		int resultado = 0;
		
		switch (opcion) {
			case 1: 
				resultado = suma(numero1, numero2);
			break;
			case 2: 
				resultado = resta(numero1, numero2);
				break;
			case 4: 
				resultado = division(numero1, numero2);
				break;
			case 3: 
				resultado = multi(numero1, numero2);
			break;
		
		}
		
		System.out.println("EL resultado es " + resultado);
	}

}
