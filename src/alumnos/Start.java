package alumnos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Alumno> alumnos = new ArrayList<>();
		
		alumnos.add(new Alumno("David", "Garcia Garcia", 11111, false, "IES LAs Lagunas"));
		alumnos.add(new Alumno("Laura", "Perez Perez", 22, false, "IES Los ALmendros"));
		
		if(alumnos.contains(new Alumno("David", "SUarez SUarez", 11111, false, "IES LAs Lagunas"))) {
			System.out.println("SIIIIII");
		} else{
			System.out.println("NOOOOO");
		}
		
		System.out.println(alumnos.indexOf(new Alumno("David", "GArcia Garcia", 11111, false, "IES LAs Lagunas")));
		System.out.println("ANtes de ordenar");
		for(int i=0;i<alumnos.size();i++) {
			System.out.println(alumnos.get(i).toString());
		}
		
		System.out.println("Despoues de ordenar");
		
		Collections.sort(alumnos);
		for(int i=0;i<alumnos.size();i++) {
			System.out.println(alumnos.get(i).toString());
		}
		
		//Alumno delegado = new Alumno("David", "Garcia Garcia", 11111, false, "IES LAs Lagunas");
				
		/*
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
		*/
	}

}
