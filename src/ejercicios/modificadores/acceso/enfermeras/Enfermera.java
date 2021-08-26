package ejercicios.modificadores.acceso.enfermeras;

import ejercicios.modificadores.acceso.TerceraEdad;

public class Enfermera {

	public void darAlta() {

		TerceraEdad cesar = new TerceraEdad();
		cesar.examenProstata();
		cesar.nombre = "";
		cesar.apellido = "";
		cesar.edad = 70;
		//cesar.realizarDiagnostico();
	}
}
