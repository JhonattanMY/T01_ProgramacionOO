package deber.tabla.de.ajedrez;

public class MainTablero {

	public static void main(String[] args) {

		Peon peonNegro = new Peon();
		peonNegro.setColor("Peon negro");
		Peon peonBlanco = new Peon();
		peonBlanco.setColor("Peon blanco");

		Caballo caballoNegro = new Caballo();
		caballoNegro.setColor("Caballo negro");
		Caballo caballoBlanco = new Caballo();
		caballoBlanco.setColor("Caballo blanco");

		Alfil alfilNegro = new Alfil();
		alfilNegro.setColor("Alfil negro");
		Alfil alfilBlanco = new Alfil();
		alfilBlanco.setColor("Alfil blanco");

		Torre torreNegra = new Torre();
		torreNegra.setColor("Torre negra");
		Torre torreBlanca = new Torre();
		torreBlanca.setColor("Torre blanca");

		Rey reyNegro = new Rey();
		reyNegro.setColor("Rey negro");
		Rey reyBlanco = new Rey();
		reyBlanco.setColor("Rey blanco");

		Reina reinaNegra = new Reina();
		reinaNegra.setColor("Reina negra");
		Reina reinaBlanca = new Reina();
		reinaBlanca.setColor("Reina blanca");

		Separacion espacio = new Separacion();
		espacio.setColor(" ");

		Pieza tablero[][] = new Pieza[8][8];

		// PARTE DE LAS PIEZAS DE COLOR NEGRO
		tablero[0][0] = torreNegra;
		tablero[0][1] = caballoNegro;
		tablero[0][2] = alfilNegro;
		tablero[0][3] = reyNegro;
		tablero[0][4] = reinaNegra;
		tablero[0][5] = alfilNegro;
		tablero[0][6] = caballoNegro;
		tablero[0][7] = torreNegra;
		tablero[1][0] = peonNegro;
		tablero[1][1] = peonNegro;
		tablero[1][2] = peonNegro;
		tablero[1][3] = peonNegro;
		tablero[1][4] = peonNegro;
		tablero[1][5] = peonNegro;
		tablero[1][6] = peonNegro;
		tablero[1][7] = peonNegro;

		// PARTE DE LAS PIEZAS DE COLOR BLANCO

		tablero[7][0] = torreBlanca;
		tablero[7][1] = caballoBlanco;
		tablero[7][2] = alfilBlanco;
		tablero[7][3] = reyBlanco;
		tablero[7][4] = reinaBlanca;
		tablero[7][5] = alfilBlanco;
		tablero[7][6] = caballoBlanco;
		tablero[7][7] = torreBlanca;
		tablero[6][0] = peonBlanco;
		tablero[6][1] = peonBlanco;
		tablero[6][2] = peonBlanco;
		tablero[6][3] = peonBlanco;
		tablero[6][4] = peonBlanco;
		tablero[6][5] = peonBlanco;
		tablero[6][6] = peonBlanco;
		tablero[6][7] = peonBlanco;

		// ESPACIOS EN BLANCO

		tablero[2][0] = espacio;   tablero[3][0] = espacio;
		tablero[2][1] = espacio;   tablero[3][1] = espacio;
		tablero[2][2] = espacio;   tablero[3][2] = espacio;
		tablero[2][3] = espacio;   tablero[3][3] = espacio;
		tablero[2][4] = espacio;   tablero[3][4] = espacio;
		tablero[2][5] = espacio;   tablero[3][5] = espacio;
		tablero[2][6] = espacio;   tablero[3][6] = espacio;
		tablero[2][7] = espacio;   tablero[3][7] = espacio;
		
		tablero[4][0] = espacio;   tablero[5][0] = espacio;
		tablero[4][1] = espacio;   tablero[5][1] = espacio;
		tablero[4][2] = espacio;   tablero[5][2] = espacio;
		tablero[4][3] = espacio;   tablero[5][3] = espacio;
		tablero[4][4] = espacio;   tablero[5][4] = espacio;
		tablero[4][5] = espacio;   tablero[5][5] = espacio;
		tablero[4][6] = espacio;   tablero[5][6] = espacio;
		tablero[4][7] = espacio;   tablero[5][7] = espacio;

		System.out.println(" ====> TABLERO DE AJEDREZ <====");

		for (int i = 0; i < tablero.length; i++) {
			System.out.print(" ");
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j]);
				if (j != tablero[i].length - 1)
					System.out.print("\t"); // -->\t : SIGNIFICA QUE HAY UN ESPACIO
			} // (EQUIVALENTE A UN "TAB" DEL TECLADO)
			System.out.println(" ");
		}

	}

}
