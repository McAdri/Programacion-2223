package BucleFor;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// ALumnos
		int numAlumnos = 10;
		int aprobados = 0;
		int total= 0;
		int maxima = 0;
		int minima = 10;
		for(int i=0;i<numAlumnos;i++) {
			Scanner teclado= new Scanner(System.in);
			System.out.println("Dime la nota del alumno " + (i+1));
			int nota = teclado.nextInt();
			if(nota >= 5) {
				aprobados++;
			}
			if(nota > maxima) {
				maxima = nota;
			}
			if(nota < minima) {
				minima = nota;
			}
			total += nota;
		}
		
		System.out.println("LA nota mas alta es " + maxima);
		System.out.println("LA nota mas baja es " + minima);
		System.out.println("Los aprobados son " + aprobados);
		System.out.println("La media es " + (total / numAlumnos));
	}

}
