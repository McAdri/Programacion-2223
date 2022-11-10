package metodos;

import java.util.Scanner;

public class Ejercicio04 {

	private static int refrescos = 0;
	private static int bocatas = 0;
	private static int cervezas = 0;
	
	private static void total() {
		
	}
	
	private static void agregaUno(int prod) {
		switch(prod) {
			case 1:
				refrescos++;
			break;
		}
	}
	
	private static void agregaDos(int prod) {
			
		}
	
	private static void eliminaUno(int prod) {
		
	}
	
	private static void borrar(int prod) {
		
	}
	
	private static void acciones(int producto) {
		//accion 1.añadir1 2. añadir2 3. quitar1 4. borrar
		int opcion = 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		do {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Dime el producto: ");
			opcion = teclado.nextInt();
			acciones(opcion);
		}while(opcion != 4);
		
		total();
	}

}
