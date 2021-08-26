package deberes.modificadores.de.acceso;

import java.util.Scanner;

public class ModificadorDefault2 {

//	REGISTARSE EN FACEBOOK USANDO EL SIGUIENTE DATOS
//	CORREO: juantamayo@gmail.com
//	NOMBRES: juan luis
//  APELLIDOS: caiza lopez
//	FECHA CUMPLEAÑOS: 29-2-2001
//	EDAD:19
	Scanner lee = new Scanner(System.in);
	String nombres;
	String apellidos;
	String cuentaTipoMail;
	String fechaCumpleanios;
	int edad;

	void validarDatos() {

		if (nombres == "juan luis") {
			System.out.println(nombres +" correcto");
		} else {
			System.out.println(nombres+" incorrecto");
			System.out.println("vuelva a intentar");
		}
		if (apellidos == "caiza lopez") {
			System.out.println(apellidos+" correcto");
		} else {
			System.out.println(apellidos+" incorrecto");
			System.out.println("vuelva a intentar");
		}
		if (cuentaTipoMail == "juantamayo@gmail.com") {
			System.out.println(cuentaTipoMail+" correcto");
		} else {
			System.out.println(cuentaTipoMail+" incorrecto");
			System.out.println("vuelva a intentar");
		}
		if (fechaCumpleanios == "29-2-2001") {
			System.out.println(cuentaTipoMail+" correcto");
			System.out.println("vuelva a intentar");
		} else {
			System.out.println(cuentaTipoMail+" incorrecto");
			System.out.println("vuelva a intentar");
		}
		if (edad == 19) {
			System.out.println(edad +" correcto");
		} else {
			System.out.println(edad +" incorrecto");
			System.out.println("vuelva a intentar");
		}
	}

}
