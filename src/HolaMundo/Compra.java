package HolaMundo;

import java.util.Scanner;

public class Compra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		System.out.print("Introduce la base imponible: ");
		float baseImponible = Float.parseFloat(teclado.nextLine());
		System.out.print("Introduce el tipo de IVA (general, reducido, superreducido): ");
		String tipoIva = teclado.nextLine();
		System.out.print("Introduce el codigo promocion():");
		String tipoPromo = teclado.nextLine();
		
		byte iva = 0;
		
		switch(tipoIva) {
			case "general":
				iva= 21;
			break;
			case "reducido":
				iva = 10;
			break;
			case"superreducido":
				iva = 4;
			break;
		}
		
		System.out.println("LA base imponible es: " + baseImponible);
		float precioIVA = baseImponible * (100 + iva) / 100;
		System.out.println("EL precio conIVA es " + precioIVA);
		System.out.println("IVA(" + iva + "%): " + (baseImponible * (iva) / 100));
		
		float precioFinal = 0;
		float cantidadDto = 0;
		
		switch(tipoPromo) {
			case "nopro":
				precioFinal = precioIVA;				
			break;
			case"mitad":
				precioFinal = precioIVA / 2;
				cantidadDto = -precioFinal;
			break;
			case "meno5":
				precioFinal = precioIVA - 5;
				cantidadDto = -5;
			break;
			case"5porc":
				precioFinal = precioIVA * 95 /100;
				cantidadDto = precioFinal * 5 /100;
			break;
		}
		
		System.out.println("LA cantidad dto ha sido: " + cantidadDto);
		System.out.println("EL precio final es " + precioFinal);
		
		
		
	}

}
