package libros;

public class Libro {

	private String titulo;
	private String autor;
	private int paginas;
	private float precio;
	private String editorial;
	private boolean oferta;
	public String atributoMALO;
	
	public Libro(String titulo,String autor,int paginas,float precio,String editorial) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.precio = precio;
		this.editorial = editorial;
		this.oferta = false;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public boolean isOferta() {
		return oferta;
	}

	public void setOferta(boolean oferta) {
		this.oferta = oferta;
	}
	
	public float calcularPrecio() {
		if(oferta) {
			return precio*0.8f;
		}else {
			return precio;
		}
	}
	
	public int contarLetra(char c) {
		int contador = 0;
		for(int i=0;i<titulo.length();i++) {
			if(c == titulo.charAt(i))
				contador++;
		}
		return contador;
	}
}
