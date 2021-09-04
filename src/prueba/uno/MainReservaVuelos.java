package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {

		Scanner leeint = new Scanner(System.in);
		Scanner leeString = new Scanner(System.in);
		System.out.println("INGRESE INFORMACION DEL PASAJERO");
		System.out.println("NOMBRE: ");
		String nombre = leeString.next();
		System.out.println("APELLIDO: ");
		String apellido = leeString.next();
		System.out.println("INGRESE EDAD");
		int edad = leeint.nextInt();
		System.out.println("QUE TIPO DE PASAJERO ES: 1--PASAJERO VIP 2--PASAJERO ECONOMICO");
		int opcion = leeint.nextInt();

		String membresia = "";
		String descuento = "";
		if (opcion == 1) {
			System.out.println("INGRESE CODIGO MEMBRESIA: ");
			membresia = leeString.next();
		} else {
			System.out.println("INGRESE CODIGO DESCUENTO");
			descuento = leeString.next();
		}

		PasajeroVip vip = new PasajeroVip();
		vip.setNombre(nombre);
		vip.setApellido(apellido);
		vip.setEdad(edad);
		vip.setCodigoMenbresia(membresia);

		PasajeroVip vip2 = new PasajeroVip(nombre, apellido, edad, membresia);

		PasajeroEconomico economico = new PasajeroEconomico();
		economico.setNombre(nombre);
		economico.setApellido(apellido);
		economico.setEdad(18);
		economico.setCodigoDeDescuento(descuento);

		PasajeroEconomico economico2 = new PasajeroEconomico(nombre, apellido, edad, descuento);

		Pasajero[][] ascientos = new Pasajero[4][5];
		ascientos[0][0] = vip;
		ascientos[1][0] = economico;
		ascientos[0][1] = vip2;
		ascientos[1][1] = economico2;

		int opcionSalir;
		do {
			System.out.println(" 0--CONTINUAR 1---SALIR");
			opcionSalir = leeint.nextInt();
			if (opcionSalir == 0) {
				System.out.println("INGRESE FILA DEL ASCIENTO");
				int fila = leeint.nextInt();
				System.out.println("INGRESE COLUMNA ASIENTO");
				int columna = leeint.nextInt();

				System.out.println("\n===> LOS DATOS DEL PASAJERO SON <===");
				System.out.println(ascientos[fila][columna]);
			} else {
				System.out.println("saliendo.......");
			}

		} while (opcionSalir != -1);
	}

}
