package BucleFor;

public class Ejercicio12 {

	public static void main(String[] args) {
		// MULTIPLOS

		int rangoMenor = 8;
		int rangoMayor = 77;
		
		if(rangoMenor < rangoMayor) {
			int primerMultiplo = 3;
			int segundoMultiplo = 5;
			int contador = 0;
			for(int i=rangoMenor;i<=rangoMayor;i++) {
				if(i%primerMultiplo == 0 && i%segundoMultiplo == 0) {
					System.out.println(i);
					contador++;
				}
			}
			System.out.println("HA habido " + contador + " numeros");
		}else {
			System.out.println("ERROR");
		}
		
	}

}
