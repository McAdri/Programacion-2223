package HolaMundo;

import java.util.Scanner;

public class Tarta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tl tipo de tarta: ");
		String saborTarta =teclado.nextLine();
		float precio = 0;
		
		switch(saborTarta) {
			case "manzana":
				precio = 18;
			break;
			case "fresa":
				precio = 16;
			break;
			case "chocolate":
				System.out.print("DIme el tipode chocolate");
				String tipoChoco = teclado.nextLine();
				if(tipoChoco.equals("blanco")) {
					precio = 15;
				}else {
					precio = 14;
				}
			break;
		}
		
		char nata, nombre;
		System.out.print("QUieres nata:");
		nata = teclado.nextLine().charAt(0);
		
		System.out.print("QUieres nombre:");
		nombre = teclado.nextLine().charAt(0);
		
		if(nata == 's' && nombre == 's') {
			precio += 4;
		}else if(nata == 's') {
			precio += 2.5;
			System.out.println("Con nata: +2.5");
		}else if(nombre == 's') {
			precio += 2.75;
		}
		
		System.out.print("Dime el tamaño: ");
		String size = teclado.nextLine();
		
		switch(size) {
			case "pequeña":
				precio *= 0.6;
			break;
			case "mediana":
				precio *= 0.75;
			break;
			
		}
	}

}
