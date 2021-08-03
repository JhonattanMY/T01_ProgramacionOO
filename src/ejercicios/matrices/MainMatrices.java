package ejercicios.matrices;

public class MainMatrices {

	public MainMatrices() {

	}

	public static void main(String[] args) {

		// 2 / agosto / 2021

		// 1. declarara un amatriz A de tipo char con 5 filas y 4 columnas

		char A[][] = new char[5][4];

		// 2.Declarar una matriz B de tipo char con 5 filas y 6 columnas

		char B[][] = new char[5][6];

		// 3. Declarar una matriz mimatriz de tipo long con 2 filas y 4 columas

		long mimatriz[][] = new long[2][4];

		// 4. Declarar una matriz mimatriz1 de long 1 fila y 2 columnas,
		// y asignar a la posicion [][] el valor de 8 en la posicion [2][2]
		// el valor de 2.

		long mimatriz1[][] = new long[1][2];

		mimatriz1[0][0] = 2;
		// mimatriz1[1][1] = 8;---> no existe posicion
		// mimatriz1[2][2] = 2;---> no existe posicion

	}

}
