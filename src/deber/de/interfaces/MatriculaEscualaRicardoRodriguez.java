package deber.de.interfaces;

public class MatriculaEscualaRicardoRodriguez implements MatriculaInterfaz {


	public void verificarHorario() {
		
		// HORRARIOS
		System.out.println("LUNES y MARTES --> Septimo y sexto de basica");
		System.out.println(" MIERCOLES y JUEVES --> Quinto y cuarto de basica");
		System.out.println("VIERNES y SABADO --> Tercero y segundo de basica");
		System.out.println("DOMINGO --> Primero de basica y jardin");
		
	}
	public void verificarDatosEstudiante() {
		// SELECCION MIERCOLES  Y JUEVES
		
	 System.out.println("NOMBRE DEL ESTUDIANTE");
	 System.out.println("CEDULA DEL ESTUDIANTE");
	 System.out.println("DIA DE MATRICULA");
	 System.out.println("PASE DE AÑO");
		
	}
	public void verificarCupos() {
		
		System.out.println("DISPONIBILIDAD DE QUE EN LAS AULAS HAYA ASIENTOS");
		
	}
	public void pagarValorMatricula() {
		
		// EN LAS ESCUELAS PUBLICAS NO SE PAGA LA MATRICULA
		
		//EN CASO DE SER UNA ESCUELA PRIVADA
		final int valorMatricula = 45;
		
	}
	public void recibirComprobanteMatricula() {
	
		System.out.println("NOMBRE DEL ESTUDIANTE");
		System.out.println("CURSO AL QUE IRA");
		System.out.println("DIA DE INGRESO A CLASES");
		System.out.println("LISTA DE UTILES");
		System.out.println("HORARI DE CLASES");
	}
	
	

}
