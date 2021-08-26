package deber.de.interfaces;

public class MatriculaColegioYaruqui implements MatriculaInterfaz {

	public void verificarHorario() {

		// HORRARIOS
		System.out.println("LUNES y MARTES --> 3ro y 2do de bachillerato");
		System.out.println(" MIERCOLES y JUEVES --> 1ro bachillerato y 10mo basica");
		System.out.println("VIERNES y SABADO --> 9no y 8vo de basica");

	}

	public void verificarDatosEstudiante() {
		// SELECCION LUNES Y MARTES

		System.out.println("NOMBRE DEL ESTUDIANTE");
		System.out.println("CEDULA DEL ESTUDIANTE");
		System.out.println("DIA DE MATRICULA");
		System.out.println("PASE DE AÑO");
		// SI ES BACHILLERATO TECNICO
		System.out.println("TIPO DE TECNICO QUE ES");

	}

	public void verificarCupos() {

		System.out.println("DISPONIBILIDAD DE QUE EN LAS AULAS HAYA ASIENTOS");

	}

	public void pagarValorMatricula() {

		// EN COLEGIOS PUBLICOS NO SE PAGA LA MATRICULA

		// EN CASO DE ELEGIR BACHILLERATO TECNICO
		System.out.println("VALOR PARA HERRAMIENTAS ELEMENTALES PARA EL AÑO ESCOLAR");
		final int valorHerramientas = 60;

	}

	public void recibirComprobanteMatricula() {

		System.out.println("NOMBRE DEL ESTUDIANTE");
		System.out.println("CURSO AL QUE IRA");
		System.out.println("DIA DE INGRESO A CLASES");
		System.out.println("LISTA DE UTILES");
		System.out.println("HORARI DE CLASES");
	}

}
