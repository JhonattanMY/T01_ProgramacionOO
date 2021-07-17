package Diagramas.de.flujo;

import java.util.Scanner;

public class MainFiguraAlrevez {
	
	// Excelente trabajo :3 
	
	public MainFiguraAlrevez() {

	}

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese el numero de filas: ");
		int n = lee.nextInt();

		System.out.println();

		for (int F = 1; F <= n; F++) {
			for (int s = n; s >= F; s--) {
				System.out.print("°");
			}
			System.out.println();
		}

	}

}
