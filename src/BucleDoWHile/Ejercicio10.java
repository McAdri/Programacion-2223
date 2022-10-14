package BucleDoWHile;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Palitos
		int numero = 5723;
		
		int contador = 0;
		int aux= numero;
		while(aux>9) {
			aux = aux / 10;
			contador++;
		}
		
		for(int i=contador;i>=0;i--) {
			int digito = numero / (int) Math.pow(10, i);
			numero = numero % (int) Math.pow(10, i);
			
			for(int j=0;j<digito;j++) {
				System.out.print("|");
			}
			System.out.print("-");
		}
	}

}
