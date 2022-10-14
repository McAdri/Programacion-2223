package BucleDoWHile;

public class Ejercicio09 {

	public static void main(String[] args) {
		// BUscar aparicion numero
		int numero = 47523;
		String cadenaSi = "";
		String cadenaNo = "";
		
		for(int i=0;i<=9;i++) {
			boolean aparece = false;
			int aux = numero;
			while(aux>0 && !aparece) {
				int digito = aux% 10;
				aux= aux / 10;
				if(digito == i) {
					aparece = true;
				}
			}
			if(aparece) {
				cadenaSi = cadenaSi + " " + i;
			}else {
				cadenaNo = cadenaNo + " " + i;
			}
		}
		System.out.println("AParecen " + cadenaSi);
		System.out.println("NO aparecen " + cadenaNo);
	}

}
