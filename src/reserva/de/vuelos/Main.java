package reserva.de.vuelos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		PasajeroVip vip = new PasajeroVip();
		vip.setNombre("Nombre: " + lee.next());
		vip.setApellido("Apellido: " + lee.next());
		vip.setEdad(lee.nextInt());
		vip.codigoDeMembresia = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		vip.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		vip.columnaAciento = lee.nextInt();

		PasajeroVip vip1 = new PasajeroVip();
		vip1.setNombre("Nombre: " + lee.next());
		vip1.setApellido("Apellido: " + lee.next());
		vip1.setEdad(lee.nextInt());
		vip1.codigoDeMembresia = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		vip1.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		vip1.columnaAciento = lee.nextInt();

		PasajeroVip vip2 = new PasajeroVip();
		vip2.setNombre("Nombre: " + lee.next());
		vip2.setApellido("Apellido: " + lee.next());
		vip2.setEdad(lee.nextInt());
		vip2.codigoDeMembresia = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		vip2.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		vip2.columnaAciento = lee.nextInt();

		PasajeroVip vip3 = new PasajeroVip();
		vip3.setNombre("Nombre: " + lee.next());
		vip3.setApellido("Apellido: " + lee.next());
		vip3.setEdad(lee.nextInt());
		vip3.codigoDeMembresia = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		vip3.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		vip3.columnaAciento = lee.nextInt();

		PasajeroVip vip4 = new PasajeroVip();
		vip4.setNombre("Nombre: " + lee.next());
		vip4.setApellido("Apellido: " + lee.next());
		vip4.setEdad(lee.nextInt());
		vip4.codigoDeMembresia = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		vip4.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		vip4.columnaAciento = lee.nextInt();

		PasajeroVip vip5 = new PasajeroVip();
		vip5.setNombre("Nombre: " + lee.next());
		vip5.setApellido("Apellido: " + lee.next());
		vip5.setEdad(lee.nextInt());
		vip5.codigoDeMembresia = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		vip5.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		vip5.columnaAciento = lee.nextInt();

		PasajeroVip vip6 = new PasajeroVip();
		vip6.setNombre("Nombre: " + lee.next());
		vip6.setApellido("Apellido: " + lee.next());
		vip6.setEdad(lee.nextInt());
		vip6.codigoDeMembresia = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		vip6.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		vip6.columnaAciento = lee.nextInt();

		PasajeroVip vip7 = new PasajeroVip();
		vip7.setNombre("Nombre: " + lee.next());
		vip7.setApellido("Apellido: " + lee.next());
		vip7.setEdad(lee.nextInt());
		vip7.codigoDeMembresia = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		vip7.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		vip7.columnaAciento = lee.nextInt();

		PasajeroVip vip8 = new PasajeroVip();
		vip8.setNombre("Nombre: " + lee.next());
		vip8.setApellido("Apellido: " + lee.next());
		vip8.setEdad(lee.nextInt());
		vip8.codigoDeMembresia = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		vip8.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		vip8.columnaAciento = lee.nextInt();

		PasajeroVip vip9 = new PasajeroVip();
		vip9.setNombre("Nombre: " + lee.next());
		vip9.setApellido("Apellido: " + lee.next());
		vip9.setEdad(lee.nextInt());
		vip9.codigoDeMembresia = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		vip9.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		vip9.columnaAciento = lee.nextInt();

		PasajeroEconomico economico = new PasajeroEconomico();
		economico.setNombre("Nombre: " + lee.next());
		economico.setApellido("Apellido: " + lee.next());
		economico.setEdad(lee.nextInt());
		economico.codigoDeDescuento = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		economico.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		economico.columnaAciento = lee.nextInt();

		PasajeroEconomico economico1 = new PasajeroEconomico();
		economico1.setNombre("Nombre: " + lee.next());
		economico1.setApellido("Apellido: " + lee.next());
		economico1.setEdad(lee.nextInt());
		economico1.codigoDeDescuento = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		economico1.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		economico1.columnaAciento = lee.nextInt();

		PasajeroEconomico economico2 = new PasajeroEconomico();
		economico2.setNombre("Nombre: " + lee.next());
		economico2.setApellido("Apellido: " + lee.next());
		economico2.setEdad(lee.nextInt());
		economico2.codigoDeDescuento = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		economico2.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		economico2.columnaAciento = lee.nextInt();

		PasajeroEconomico economico3 = new PasajeroEconomico();
		economico3.setNombre("Nombre: " + lee.next());
		economico3.setApellido("Apellido: " + lee.next());
		economico3.setEdad(lee.nextInt());
		economico3.codigoDeDescuento = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		economico3.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		economico3.columnaAciento = lee.nextInt();

		PasajeroEconomico economico4 = new PasajeroEconomico();
		economico4.setNombre("Nombre: " + lee.next());
		economico4.setApellido("Apellido: " + lee.next());
		economico4.setEdad(lee.nextInt());
		economico4.codigoDeDescuento = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		economico4.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		economico4.columnaAciento = lee.nextInt();

		PasajeroEconomico economico5 = new PasajeroEconomico();
		economico5.setNombre("Nombre: " + lee.next());
		economico5.setApellido("Apellido: " + lee.next());
		economico5.setEdad(lee.nextInt());
		economico5.codigoDeDescuento = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		economico5.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		economico5.columnaAciento = lee.nextInt();

		PasajeroEconomico economico6 = new PasajeroEconomico();
		economico6.setNombre("Nombre: " + lee.next());
		economico6.setApellido("Apellido: " + lee.next());
		economico6.setEdad(lee.nextInt());
		economico6.codigoDeDescuento = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		economico6.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		economico6.columnaAciento = lee.nextInt();

		PasajeroEconomico economico7 = new PasajeroEconomico();
		economico7.setNombre("Nombre: " + lee.next());
		economico7.setApellido("Apellido: " + lee.next());
		economico7.setEdad(lee.nextInt());
		economico7.codigoDeDescuento = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		economico7.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		economico7.columnaAciento = lee.nextInt();

		PasajeroEconomico economico8 = new PasajeroEconomico();
		economico8.setNombre("Nombre: " + lee.next());
		economico8.setApellido("Apellido: " + lee.next());
		economico8.setEdad(lee.nextInt());
		economico8.codigoDeDescuento = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		economico8.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		economico8.columnaAciento = lee.nextInt();

		PasajeroEconomico economico9 = new PasajeroEconomico();
		economico9.setNombre("Nombre: " + lee.next());
		economico9.setApellido("Apellido: " + lee.next());
		economico9.setEdad(lee.nextInt());
		economico9.codigoDeDescuento = lee.nextInt();
		System.out.println("Ingre fila aciento: ");
		economico9.filaAciento = lee.nextInt();
		System.out.println("Ingrese columna aciento: ");
		economico9.columnaAciento = lee.nextInt();

		Pasajero aciento[][] = new Pasajero[economico.columnaAciento][vip.filaAciento];

		// Pasajeros VIP
		aciento[0][0] = vip;
		aciento[3][0] = vip;
		aciento[0][1] = vip;
		aciento[3][1] = vip;
		aciento[0][2] = vip;
		aciento[3][2] = vip;
		aciento[0][3] = vip;
		aciento[3][3] = vip;
		aciento[0][4] = vip;
		aciento[3][4] = vip;

		// Pasajeros Economicos
		aciento[0][0] = economico;
		aciento[3][0] = economico5;
		aciento[0][1] = economico1;
		aciento[3][1] = economico6;
		aciento[0][2] = economico2;
		aciento[3][2] = economico7;
		aciento[0][3] = economico3;
		aciento[3][3] = economico8;
		aciento[0][4] = economico4;
		aciento[3][4] = economico9;

		for (int i = 0; i < aciento.length; i++) {
			System.out.print(" ");
			for (int j = 0; j < aciento[i].length; j++) {
				System.out.print(aciento[i][j]);
				if (j != aciento[i].length - 1)
					System.out.print("\t"); // -->\t : SIGNIFICA QUE HAY UN ESPACIO
			} // (EQUIVALENTE A UN "TAB" DEL TECLADO)
			System.out.println(" ");
		}

	}

}
