package metodos;

public class Ejemplo02 {

	private static int valor = 4;
	
	private static int potencia(int base,int exp) {
		int resultado = 77;
		System.out.println("ENtrando en metodo");
		System.out.println("Resultado vale " + resultado);
		
		resultado = (int) Math.pow(base, exp);
		System.out.println("Y ahora vale " + resultado);
		
		valor = 33;
		return resultado;
	}
	
	public static void main(String[] args) {
		
		System.out.println(valor);
		
		int total = potencia(2, 5);
		int base = 3;
		int exp = 2;
		System.out.println(total);
		System.out.println(potencia(base, exp));
		System.out.println(valor);
		
	}

}
