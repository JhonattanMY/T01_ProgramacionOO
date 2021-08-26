package deber.de.interfaces;

import java.util.Scanner;

public class BibliotecaElectronica implements BibliotecaInterfaz {

	Scanner lee = new Scanner(System.in);

	public void alquilarLibro() {

		System.out.println("NO SE PUEDE ALQUILAR EN UNA BIBLIOTECA ELECTRONICA :(");
	}

	public void recibirLibro() {

		System.out.println("CARGAR LIBRO DESDE EL EQUIPO");
		System.out.println("Ingresar nombre libro: ");
		String nombreLIbro = lee.next();
		System.out.println("Ingrese el autor: ");
		String autor = lee.next();
		System.out.println("Ingrese una sinopsis: ");
		String sinopsis = lee.next();
		System.out.println("Visualizacion del libro: ");
		String visualizacion = lee.next();
		System.out.println("PUBLICAR EL LIBRO");

	}

	public void buscarLibro() {
		System.out.println("Ingresar nombre libro: ");
		String nombreLIbro = lee.next();
		System.out.println("Ingrese el autor: ");
		String autor = lee.next();
		System.out.println("SELECCIONAR LIBRO ENTRE TODAS LAS OPCIONES");

	}

	public void reservarLibro() {
		System.out.println("Ingresar nombre libro: ");
		String nombreLIbro = lee.next();
		System.out.println("Ingrese el autor: ");
		String autor = lee.next();
		System.out.println("VERIFICAR LA DISPONIBILIDAD DEL LIBRO");
		// SI ESTA DISPONIBLE LO ALQUILAS.

	}

	public void comprarLibro() {
		System.out.println("Ingresar nombre libro: ");
		String nombreLIbro = lee.next();
		System.out.println("Ingrese el autor: ");
		String autor = lee.next();
		System.out.println("VERIFICAR LA DISPONIBILIDAD DEL LIBRO");
		System.out.println("Costo del libro es: $23");
		System.out.println("-------Solicitar la compra-------");
		System.out.println("Ingresar datos de la tarjeta: ");
		String datosTarjeta = lee.next();
		System.out.println("Ingrese un e-mail: ");
		String email = lee.next();
		System.out.println("REALIZAR EL PAGO");
		System.out.println("VERIFICAR COMPROBANTE ELECTRONICO EN EL EMAIL");

	}
}
