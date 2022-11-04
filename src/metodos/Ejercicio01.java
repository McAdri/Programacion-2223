package metodos;

public class Ejercicio01 {
	
	private static boolean esPrimo(int num) {
		for(int i=2;i<num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3;i<=3000;i++) {
			if(esPrimo(i)) {
				System.out.println(i + " Es primo");
			}
		}
	}

}
