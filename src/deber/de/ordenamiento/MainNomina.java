package deber.de.ordenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class MainNomina {

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		Empleado persona = new Empleado();
		System.out.println("=============================");
		persona.setNombre("Emerson");
		persona.setApellido("Carranza");
		persona.setEdad(20);
		System.out.println(
				"Nombre: " + persona.getNombre() + " " + persona.getApellido() + "\nEdad: " + persona.getEdad());
		System.out.print("Ingrese sueldo del empleado: $");
		persona.setSalario(lee.nextInt());

		Empleado persona2 = new Empleado();
		System.out.println("=============================");
		persona2.setNombre("Willam");
		persona2.setApellido("Guacollantes");
		persona2.setEdad(30);
		System.out.println(
				"Nombre: " + persona2.getNombre() + " " + persona2.getApellido() + "\nEdad: " + persona2.getEdad());
		System.out.print("Ingrese sueldo del empleado: $");
		persona2.setSalario(lee.nextInt());

		Empleado persona3 = new Empleado();
		System.out.println("=============================");
		persona3.setNombre("Wilmer");
		persona3.setApellido("Tapia");
		persona3.setEdad(19);
		System.out.println(
				"Nombre: " + persona3.getNombre() + " " + persona3.getApellido() + "\nEdad: " + persona3.getEdad());
		System.out.print("Ingrese sueldo del empleado: $");
		persona3.setSalario(lee.nextInt());

		Empleado persona4 = new Empleado();
		System.out.println("=============================");
		persona4.setNombre("Narcisa");
		persona4.setApellido("Yanacallo");
		persona4.setEdad(40);
		System.out.println(
				"Nombre: " + persona4.getNombre() + " " + persona4.getApellido() + "\nEdad: " + persona4.getEdad());
		System.out.print("Ingrese sueldo del empleado: $");
		persona4.setSalario(lee.nextInt());

		Empleado persona5 = new Empleado();
		System.out.println("=============================");
		persona5.setNombre("Katherin");
		persona5.setApellido("Muñoz");
		persona5.setEdad(22);
		System.out.println(
				"Nombre: " + persona5.getNombre() + " " + persona5.getApellido() + "\nEdad: " + persona5.getEdad());
		System.out.print("Ingrese sueldo del empleado: $");
		persona5.setSalario(lee.nextInt());

		Empleado persona6 = new Empleado();
		System.out.println("=============================");
		persona6.setNombre("Jorge");
		persona6.setApellido("Tipanluisa");
		persona6.setEdad(21);
		System.out.println(
				"Nombre: " + persona6.getNombre() + " " + persona6.getApellido() + "\nEdad: " + persona6.getEdad());
		System.out.print("Ingrese sueldo del empleado: $");
		persona6.setSalario(lee.nextInt());

		Empleado persona7 = new Empleado();
		System.out.println("=============================");
		persona7.setNombre("Julian");
		persona7.setApellido("Caiza");
		persona7.setEdad(32);
		System.out.println(
				"Nombre: " + persona7.getNombre() + " " + persona7.getApellido() + "\nEdad: " + persona7.getEdad());
		System.out.print("Ingrese sueldo del empleado: $");
		persona7.setSalario(lee.nextInt());

		Empleado persona8 = new Empleado();
		System.out.println("=============================");
		persona8.setNombre("Nicol");
		persona8.setApellido("Perez");
		persona8.setEdad(26);
		System.out.println(
				"Nombre: " + persona8.getNombre() + " " + persona8.getApellido() + "\nEdad: " + persona8.getEdad());
		System.out.print("Ingrese sueldo del empleado: $");
		persona8.setSalario(lee.nextInt());

		Empleado persona9 = new Empleado();
		System.out.println("=============================");
		persona9.setNombre("Sara");
		persona9.setApellido("Simbaña");
		persona9.setEdad(35);
		System.out.println(
				"Nombre: " + persona9.getNombre() + " " + persona9.getApellido() + "\nEdad: " + persona9.getEdad());
		System.out.print("Ingrese sueldo del empleado: $");
		persona9.setSalario(lee.nextInt());

		Empleado persona10 = new Empleado();
		System.out.println("=============================");
		persona10.setNombre("David");
		persona10.setApellido("Jimenez");
		persona10.setEdad(50);
		System.out.println(
				"Nombre: " + persona10.getNombre() + " " + persona10.getApellido() + "\nEdad: " + persona10.getEdad());
		System.out.print("Ingrese sueldo del empleado: $");
		persona10.setSalario(lee.nextInt());

		Empleado nomina[] = new Empleado[10];

		nomina[0] = persona;
		nomina[1] = persona10;
		nomina[2] = persona7;
		nomina[3] = persona3;
		nomina[4] = persona2;
		nomina[5] = persona6;
		nomina[6] = persona9;
		nomina[7] = persona5;
		nomina[8] = persona8;
		nomina[9] = persona4;

		Arrays.sort(nomina);
		System.out.println("\n\n====> NOMINA DE LA EMPRESA GPF <====");
		System.out.println(Arrays.toString(nomina));

	}

}
