package entornos;

public class ejerdebug {

	private static void imprimeReves(String texto) {
		for(int i=texto.length();i>0;i--) {
			System.out.print(texto.charAt(i*2));
		}
	}
	
	private static int resta(int num1,int num2) {
		int resultado = num2 - num1;
		return resultado;
	}
	
	private static void rectangulo(int base,int altura) {
		for(int i=0;i<base;i--) {
			for(int j=2;j<=altura;j+=2) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		String texto = "Hola, hoy es jueves, que dia mas duro";
		imprimeReves(texto);
		System.out.println(resta(7, 3));
		System.out.println(resta(3, 9));
		
		int base = 3;
		int altura =7;
		if(base == altura) {
			rectangulo(base, altura);
		}else {
			System.out.println("Eso es un cuadrado");
		}
	}

}
