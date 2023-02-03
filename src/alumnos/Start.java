package alumnos;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno delegado = new Alumno("David", "Garcia GArcia", 11111, false, "IES LAs Lagunas");
		
		System.out.println(delegado.getCurso());
		
		//delegado.setCurso(3);
		
		System.out.println(delegado.getCurso());
		
		//NOTAS
		System.out.println("nota original");
		System.out.println(delegado.getNota());
		
		delegado.examinarse();
		System.out.println("despues de examen");
		System.out.println(delegado.getNota());
		
		delegado.copiar();
		
		if(delegado.pasaCurso()) {
			System.out.println("adelante");
		}else {
			System.out.println(" a repetir");
		}
	}

}
