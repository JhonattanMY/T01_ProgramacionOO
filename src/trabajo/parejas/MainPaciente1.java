package trabajo.parejas;

import java.util.Scanner;

public class MainPaciente1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese turno: ");
		int Z = teclado.nextInt();
		Sistema1 turnos = new Sistema1();
		turnos.tomarTurnos("Andrés", "Asitimbay", "1234567890", Z, "097964941");

		Sistema1 pago = new Sistema1();
		pago.metodoPago("Pago en efectivo");
	}

}
