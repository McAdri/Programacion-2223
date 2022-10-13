package BucleDoWHile;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Buscar digito
		int numero = 45327;
		int digito = 2;
		boolean encontrado = false;
		while(numero>0 && !encontrado) {
			int ultimoDigito = numero % 10; 
			if(ultimoDigito == digito ) {
				encontrado = true;
			}
			numero = numero / 10; 
			
		}
		
		if(encontrado) {
			System.out.println("Ese digito si aparece");
		} else{
			System.out.println("ESe digito no aparece");
		}

	}

}
