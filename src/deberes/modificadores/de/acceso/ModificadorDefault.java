package deberes.modificadores.de.acceso;

public class ModificadorDefault {

	// DECLARACION DE ATRIBUTOS Y METODO DEFAULT

	int numeroEntero;
	double numeroRacional;
	int numeroNatural;
	int numeroReal;

	void operaciones(int suma, double resta, long multiplicacion, double division) {

		suma = numeroEntero + numeroNatural;
		resta = numeroNatural - numeroRacional;
		multiplicacion = numeroReal * numeroEntero;
		division = numeroRacional / numeroReal;
	}
}
