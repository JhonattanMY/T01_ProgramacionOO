package ejercicios.odenamiento;

import java.util.Arrays;

public class MainPrimeraClase {

	public static void main(String[] args) {

		// PRIMER DIA DE CLASES
		// EL PROFESOR NOS DA NUESTRO NUMERO DE LISTA

		Estudiante danilo = new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);
		danilo.setApellido("Albarrasin");
		danilo.setEdad(20);

		Estudiante andres = new Estudiante();
		andres.setNombre("Andres");
		andres.setNumeroLista(2);
		andres.setApellido("Asitimbay");
		andres.setEdad(21);

		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(22);
		alex.setApellido("Pachacama");
		alex.setEdad(18);

		Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(12);
		stefany.setApellido("Aguirre");
		stefany.setEdad(19);

		Estudiante jhonny = new Estudiante();
		jhonny.setNombre("jhonny");
		jhonny.setNumeroLista(21);
		jhonny.setApellido("Ninabanda");
		jhonny.setEdad(22);

		Estudiante lista[] = new Estudiante[5];

		lista[0] = danilo;
		lista[1] = andres;
		lista[2] = alex;
		lista[3] = stefany;
		lista[4] = jhonny;

		// VECTOR ANTES DE ORDENARSE
		System.out.println("=====> lista antes de ordenar <=====");
		System.out.println(Arrays.toString(lista));

		// VECTOR DESPUES DE ORDENAR
		Arrays.sort(lista);
		System.out.println("=====> lista despues de ordenar <=====");
		System.out.println(Arrays.toString(lista));
		
		
		
//		deber: construya un programa de nomina(talento humano) de la empersa gpf
//		en la que existen 10 empleados, que tienen la siguiente informacion: 
//			nombre, apellido, edad, salario. Y QUE ME PERMITA IMPREIMIR UN REPORTE DE 
//		TODOS LOS EMPLEADOS ORDENADOS POR SUS SALARIO DE MENOR A MAYOR

	}

}
