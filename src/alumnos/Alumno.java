package alumnos;

public class Alumno implements Comparable<Alumno>{

	private String nombre;
	private String apellidos;
	private int curso;
	private int numMatricula;
	private boolean becado;
	private String centroProcedencia;
	private int nota;
	private boolean repetidor;
	
	public Alumno(String nombre,String apellidos,int numMatricula, boolean becado,String centroProcedencia) {
		this.nombre = nombre;
		this.apellidos = apellidos;		
		this.curso = 1;
		this.numMatricula = numMatricula;
		this.becado = becado;
		this.centroProcedencia = centroProcedencia;
		nota = 0;
		repetidor = false;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public int getCurso() {
		return curso;
	}



	public void setCurso(int curso) {
		this.curso = curso;
	}



	public int getNumMatricula() {
		return numMatricula;
	}



	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}



	public boolean isBecado() {
		return becado;
	}



	public void setBecado(boolean becado) {
		this.becado = becado;
	}



	public String getCentroProcedencia() {
		return centroProcedencia;
	}



	public void setCentroProcedencia(String centroProcedencia) {
		this.centroProcedencia = centroProcedencia;
	}



	public int getNota() {
		return nota;
	}



	public void setNota(int nota) {
		this.nota = nota;
	}



	public boolean isRepetidor() {
		return repetidor;
	}



	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}



	public void examinarse() {
		nota = (int) (Math.random()*11);
	}
	
	public void copiar() {
		nota = 0;
	}
	
	public void recibirParte() {
		if(nota>1)
			nota -= 2;
	}
	
	public void hacerDeberes() {
		if(nota<10)
			nota++;
	}
	
	public String calcularNota() {
		return "hola";
	}
	
	public boolean pasaCurso() {
		if(nota>=5) {
			curso++;
			nota = 0;
			return true;
		}else {
			nota = 0;
			repetidor = true;
			return false;
		}
	}
	
	public float pagarMes() {
		float precio;
		if(curso == 1) {
			precio = 200;
		}
		else {
			precio = 350;
		}
		
		if(becado) {
			precio *= 0.1;
		} else if (repetidor) {
			precio *= 2.5;
		}
		return precio;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + ", numMatricula="
				+ numMatricula + ", becado=" + becado + ", centroProcedencia=" + centroProcedencia + ", nota=" + nota
				+ ", repetidor=" + repetidor + "]";
	}


	public int compareTo(Alumno alumno) {
		return (this.numMatricula < alumno.getNumMatricula() ? -1 :
			(this.numMatricula == alumno.getNumMatricula() ? 0 : 1));
		
		
	}

	@Override
	public boolean equals(Object o) {
		if(nombre.equalsIgnoreCase(((Alumno) o).nombre) && apellidos.equalsIgnoreCase(        ((Alumno) o).apellidos           )) {
			return true;
		} else {
			return false;
		}
	}
}
