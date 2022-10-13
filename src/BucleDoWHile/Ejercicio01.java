package BucleDoWHile;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Calculadora
		int menu = 0;
		do {
			Scanner teclado= new Scanner(System.in);
			System.out.print("ELige un opcion: ");
			menu = teclado.nextInt();
			int num1 = 0, num2 = 0;
			if(menu >= 1 && menu <=4) {
				System.out.print("Dime el primero: ");
				num1 = teclado.nextInt();
				System.out.print("Dime el segundo: ");
				num2 = teclado.nextInt();
			}
			int resultado=0;
			switch(menu) {
				case 1:
					resultado = num1 + num2;
				break;
				case 2:
					resultado = num1 - num2;
				break;
				case 3:
					resultado = num1 * num2;
				break;
				case 4:
					resultado = num1 / num2;
				break;
				case 5:
					System.out.println("Adios");
				break;
				default:
					System.out.println("ERROR");
				break;
			}
			System.out.println(resultado);
		}while(menu != 5);
	}

}
