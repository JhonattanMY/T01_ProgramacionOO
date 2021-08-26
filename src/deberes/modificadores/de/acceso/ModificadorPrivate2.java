package deberes.modificadores.de.acceso;

public class ModificadorPrivate2 {

	// CUENTA DE G-MAIL DE UNA PERSONA

	private int contraseña;
	private String fechaCumpleaños;
	private int edad;

	private void validacionContraseña(boolean valida) {

		if (valida == true) {
			System.out.println("Su contraseña es correcta");
			System.out.println(fechaCumpleaños);
			System.out.println(edad);
			
		} else if (valida == false) {
			System.out.println("Su contraseña es incorrecta");
			System.out.println("Intentelo de nuevo");
			
		} else {
			System.out.println("Inexistente");
		}
	}
}
