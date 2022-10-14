package BucleDoWHile;

public class Ejercicio11 {

	public static void main(String[] args) {
		// PAlitos con string
		int numero = 5723;
		String cadena = "";
		while(numero>0) {
			int digito = numero % 10;
			numero = numero / 10;
			for(int i=0;i<digito;i++) {
				cadena = "|" + cadena;
			}
			cadena = "-" + cadena; 
		}
		System.out.println(cadena);
	}

}
