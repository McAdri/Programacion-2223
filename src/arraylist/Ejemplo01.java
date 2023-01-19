package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo01 {

	private static int suma(ArrayList<Integer> enteros) {
		int total = 0;
		for(int i=0;i<enteros.size();i++) {
			total += enteros.get(i);
		}
		return total;
	}
	
	private static int pares(ArrayList<Integer> enteros) {
		int total = 0;
		for(int i=0;i<enteros.size();i++) {
			if
			(enteros.get(i) % 2 == 0) {
				total++;
			}
		}
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		
		Scanner teclado =new Scanner(System.in);
		int num;
		
		while((num = teclado.nextInt()) != -1) {
			numeros.add(num);
		}
		
		for(int i=0;i<numeros.size();i++) {
			System.out.println(numeros.get(i));
		}
		
		System.out.println(suma(numeros));
		System.out.println(pareds(numeros));
	}

}
