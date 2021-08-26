package deber.de.interfaces;

import java.util.Scanner;

public class ConsultorioDoctorAlbuja implements ConsultorioInterfaz {

	Scanner teclado = new Scanner(System.in);

	public void reservarCita() {

		System.out.println("REALIZAR UNA LLAMADA AL CONSULTORIO");
		System.out.println("PUEDE HACERSE POR INTERNET");
		System.out.println("Nombre completo de la persona: ");
		String nombre = teclado.next();
		System.out.println("Edad: ");
		int edad = teclado.nextInt();
		System.out.println("Numero de celular: ");
		int numeroCelular = teclado.nextInt();
		System.out.println("Tipo de consulta: ");
		System.out.println("Dia de la consulta: ");
		int dia = teclado.nextInt();
		System.out.println("Hora: ");
		int hora = teclado.nextInt();

	}

	public void atencionCliente() {

		int numeroDeConsulta = 60;
		double costoConsulta = 40.95;
		System.out.println("VARIFIACAR SI LOS DATOS ESTEN CORRECTOS");
		System.out.println("Numero de consulta: " + numeroDeConsulta);
		System.out.println("Costo de la consulta: " + costoConsulta);
		System.out.println("ENTREGAR COMPROBANTE DE LA CONSULTA");
		System.out.println(" ENVIAR AL NUMERO DE CELULAR UN COMPROBANTE ELECTRONICO");

	}

	public void VerificarHistorialClinico() {

		System.out.println("TOMAR SIGNOS VITALES");
		System.out.println("¿Cuales son sus sintomas ? ");
		String sintomas = teclado.next();
	}

	public void realizarAtencionFisica() {

		// DOLOR ESTOMACAL

		System.out.println("REALIZAR EXAMENES");
		System.out.println("VERIFICAR SI ES ALGO MALIGNO O VENIGNO");
		System.out.println("ENTREGAR RESULTADO DE LOS EXAMENES");
		System.out.println("RECETAR MEDICACION Y INDICACIONES DE USO");
	}

	public void realizarPago() {
		System.out.println("Ingrese metodo de pago: ");
		String metodoPago = teclado.next();
		System.out.println("REALIZAR EL PAGO");
		System.out.println("RESIBIR EL COMPROBANTE DE LA CONSULTA");

	}
}
