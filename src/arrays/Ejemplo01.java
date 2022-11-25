package arrays;

import java.util.Scanner;

public class Ejemplo01 {

	private static void imprimeArray(float[] numeros) {
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] notas = new float[3];
		Scanner teclado = new Scanner(System.in);
	
		
		for(int i=0;i<notas.length;i++) {
			System.out.print("DIme la nota:");
			float nota = teclado.nextFloat();
			if(nota < 5) {
				notas[i] = 5;
			}else {
				notas[i] = nota;
			}
			
		}
		
		for(int i=0;i<notas.length;i++) {
			if(notas[i]<5) {
				notas[i] = 5;
			}
		}
		
		imprimeArray(notas);
		
	}

}
