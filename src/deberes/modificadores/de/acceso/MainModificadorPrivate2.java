package deberes.modificadores.de.acceso;

public class MainModificadorPrivate2 {

	public static void main(String[] args) {

		ModificadorPrivate comprobar = ModificadorPrivate();
		comprobar.fechaCumpleaños = "29-09-2001";

		ModificadorPrivate comprobar2 = ModificadorPrivate();
		comprobar2.edad = 19;

		ModificadorPrivate comprobar3 = ModificadorPrivate();
		comprobar3.validacionContraseña(true);
	}

}
