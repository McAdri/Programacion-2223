package libros;

public class Start {

	private static int contarLetras(String texto,char c) {
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro miLibro = new Libro("Corazon de tinta", "Perez-Reverte", 257, 15.9f, "De bolsillo fake");
		
		//imprimimos titulo
		System.out.println(miLibro.getTitulo());
		//imprimimos autor
		System.out.println(miLibro.getAutor());
		//cambiamos autor
		miLibro.setAutor("Cornelia Funke");
		System.out.println(miLibro.getAutor());
		
		miLibro.atributoMALO = "ESTO NO SE HACE. ES UN SUSPENSO COMO LA CATEDRAL DE ASTORGA DE GRANDE";
		System.out.println(miLibro.atributoMALO);
		
		miLibro.setOferta(true);
		
		System.out.println(miLibro.calcularPrecio());
		
		System.out.println(miLibro.contarLetra('a'));
		
		contarLetras(miLibro.getTitulo(), 'a');
	}

}
