package deberes.modificadores.de.acceso;

public class MainModificadorPublic {

	public static void main(String[] args) {

		// COMPORTAMIENTO DE ATRIBUTOS PUBLICOS EN UNA CLASE DIFERENTE

		ModificadorPublic nombre = new ModificadorPublic();
		nombre.nombreAnimal = "Leonard";

		ModificadorPublic edad = new ModificadorPublic();
		edad.edadAnimal = 12;

		ModificadorPublic tipo = new ModificadorPublic();
		tipo.tipoAnimal = "Gato";

		// COMPORTAMIENTO DE UN METODO PUBLICO EN OTRA CLASE

		ModificadorPublic tipoComida = new ModificadorPublic();
		System.out.println("Ingrese la comida que recibe el animal");
		tipoComida.alimentarse();

		ModificadorPublic horario = new ModificadorPublic();
		System.out.println("Ingrese los dias que corre el animal");
		horario.correr();
	}

}
