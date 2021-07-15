package Diagramas.de.flujo;

import java.util.Scanner;

public class MainFigura {

	public MainFigura() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// 1) Ejercicio de repaso de las figuras
        //con asteriscos.

		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese el numero de filas: ");
		int n = lee.nextInt();

		System.out.println();
		for (int fila = 1; fila <= n; fila++) {
			for (int aste = 1; aste <= fila; aste++) {
				System.out.print("°");
			}

			System.out.println(); // salto de linea
		}
	}

}
