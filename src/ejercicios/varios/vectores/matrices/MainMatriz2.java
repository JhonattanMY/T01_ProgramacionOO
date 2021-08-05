package ejercicios.varios.vectores.matrices;

public class MainMatriz2 {

	public MainMatriz2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

//		2. Desarrollar un programa que imprima la siguiente imagen:
//		(Imagen del excel del profe).

		int B[][] = new int[5][5];
		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++) {

				if (fila == columna) {
					B[fila][columna] = 1;
				} else {
					B[fila][columna] = 0;
				}
			}
		}
		System.out.println("==La figura es==");
		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++) {
				System.out.print(B[fila][columna] + " ");
			}
			System.out.println();

		}
	}
}
