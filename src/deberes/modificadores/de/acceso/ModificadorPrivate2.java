package deberes.modificadores.de.acceso;

public class ModificadorPrivate2 {

	// CUENTA DE G-MAIL DE UNA PERSONA

	private int contrase�a;
	private String fechaCumplea�os;
	private int edad;

	private void validacionContrase�a(boolean valida) {

		if (valida == true) {
			System.out.println("Su contrase�a es correcta");
			System.out.println(fechaCumplea�os);
			System.out.println(edad);
			
		} else if (valida == false) {
			System.out.println("Su contrase�a es incorrecta");
			System.out.println("Intentelo de nuevo");
			
		} else {
			System.out.println("Inexistente");
		}
	}
}
