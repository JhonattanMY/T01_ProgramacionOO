package resguardo.de.ejercicios.del.taller;

import java.util.Arrays;

public class MainPrimeraClase {

	public static void main(String[] args) {

		// PRIMER DIA DE CLASES
		// EL PROFESOR NOS DA NUESTRO NUMERO DE LISTA

		Estudiante danilo = new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);

		Estudiante andres = new Estudiante();
		andres.setNombre("Andres");
		andres.setNumeroLista(2);

		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(22);

		Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(12);

		Estudiante jhonny = new Estudiante();
		jhonny.setNombre("jhonny");
		jhonny.setNumeroLista(21);

		System.out.println("Ing. soy el: " + alex.getNumeroLista());
		System.out.println("Inge. soy el: " + andres.getNumeroLista());

		Estudiante lista[] = new Estudiante[5];

		lista[0] = danilo;
		lista[1] = andres;
		lista[2] = alex;
		lista[3] = stefany;
		lista[4] = jhonny;

		// VECTOR ANTES DE ORDENARSE
		System.out.println("lista antes de ordenar");
		System.out.println(Arrays.toString(lista));

		// VECTOR DESPUES DE ORDENAR
		Arrays.sort(lista);
		System.out.println("lista despues de ordenar");
		System.out.println(Arrays.toString(lista));

	}

}
