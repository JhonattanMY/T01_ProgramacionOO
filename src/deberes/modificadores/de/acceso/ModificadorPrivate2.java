package deberes.modificadores.de.acceso;

public class ModificadorPrivate2 {

	// CUENTA DE G-MAIL DE UNA PERSONA

	private int contraseņa;
	private String fechaCumpleaņos;
	private int edad;

	private void validacionContraseņa(boolean valida) {

		if (valida == true) {
			System.out.println("Su contraseņa es correcta");
			System.out.println(fechaCumpleaņos);
			System.out.println(edad);
			
		} else if (valida == false) {
			System.out.println("Su contraseņa es incorrecta");
			System.out.println("Intentelo de nuevo");
			
		} else {
			System.out.println("Inexistente");
		}
	}
}
