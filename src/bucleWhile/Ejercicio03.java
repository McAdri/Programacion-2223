package bucleWhile;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Suma
		int suma = 0;
		int contador = 0;
		int maximo = 0;
		Scanner teclado= new Scanner(System.in);
		while(suma <= 10000) {
			System.out.println("DIme unnumero: ");
			int num = teclado.nextInt();
			suma += num;
			contador++;
			if(num>maximo) {
				maximo = num;
			}
		}
		System.out.println("LA media es " + (suma / contador));
		System.out.println("EL maximo es " + maximo);
		System.out.println("Se han metido " + contador + " numeros");

	}

}
