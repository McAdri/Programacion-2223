package BucleFor;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int contadorPositivos = 0, contadorNegativos = 0;
		int total=0;
		for(int i=0;i<10;i++) {
			System.out.print("Por favor, introduce un numero: ");
			int numero = teclado.nextInt();
			if(numero > 0) {
				contadorPositivos++;
			} else if(numero<0){
				contadorNegativos++;
			}
			total += numero;			
		}
		
		System.out.println("Hay " + contadorPositivos +" numeros postivivos");

		System.out.println("Hay " + contadorNegativos +" numeros negativos");
		System.out.println("EL total ha sido " + total);

	}

}
