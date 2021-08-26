package deber.de.interfaces;

import java.util.Scanner;

public class BibliotecaUniversidadCentralEcuador {

	Scanner lee = new Scanner(System.in);

	public void alquilarLibro() {
		String nombreLibro;
		int dia;
		System.out.println("Nombre del autor o titulo del libro: ");
		nombreLibro = lee.next();
		System.out.println("Año de publicacion: ");
		int año = lee.nextInt();
		System.out.println("Cuantos dias se lo llevara: ");
		dia = lee.nextInt();
	}

	public void recibirLibro() {
		System.out.println("Nombre completo del donador: ");
		String nombreC = lee.next();
		System.out.println("Edad del donador: ");
		int edad = lee.nextInt();
		System.out.println("Firmar el acuerdo de no debolucion: ");
	}

	public void buscarLibro() {
		System.out.println("Nombre del autor o titulo del libro: ");
		String libro = lee.next();
		System.out.println("Año de publicacion: ");
		int año = lee.nextInt();
		System.out.println("VERIFICAR LA DISPONIBILIDAD DEL LIBRO");
		System.out.println("Seleccionar numero de edicion del libro: ");
		String editorial = lee.next();
	}

	public void reservarLibro() {
		System.out.println("Nombre del autor o titulo del libro: ");
		String libroReserva = lee.next();
		System.out.println("Año de publicacion: ");
		int año = lee.nextInt();
		System.out.println("VERIFICAR LA DISPONIBILIDAD DEL LIBRO");
		// SI ESTA DISPONIBLE LO ALQUILAS.

	}

	public void comprarLibro() {
		System.out.println("Nombre del autor o titulo del libro: ");
		String libroCompra = lee.next();
		System.out.println("Año de publicacion: ");
		int año = lee.nextInt();
		System.out.println("VERIFICAR LA DISPONIBILIDAD DEL LIBRO");
		System.out.println("Costo del libro es: $25");
		System.out.println("-------Solicitar la compra-------");
		System.out.println("Ingrese metodo de pago: ");
		String metodoPago = lee.next();
		System.out.println("REALIZAR EL PAGO");
		System.out.println("RECIBIR EL COMPROBANTE DE COMPRA");

	}
}
