package ejercicios.vectores;

public class MainVectores {

	public MainVectores() {

	}

	public static void main(String[] args) {

		// 2/ Agosto /2021

		// 1.Declarar mivector(10) de tipo int

		int mivector[] = new int[10];

		// 2. Declarar un vector mivector1(5) de tipo char.

		char mivector1[] = new char[5];

		// 3. Declarar un vector mivec(4) de tipo char y asignamos
		// la letraA' a la posicion 0 y 2.

		char mivec[] = new char[4];

		mivec[0] = 'A';
		mivec[2] = 'A';

		// 4. Declarar un vector mivec1(3) de tipo byte y asignamos
		// el numero '00 a la posicion 0, 1,2 y 3.

		byte mivec1[] = new byte[3];

		mivec1[0] = 0;
		mivec1[1] = 0;
		mivec1[2] = 0;
		// mivec1[3] = 0; -----> Esta es una mala asignacion porque esta fuera
		//                       de rango la posicion 3.

		// 5. Declara un vector mivec2(3) de tipo char y asignar la letra 'A'
		// a las posiciones 0 y 1; y al a posicion 2 la letra 'B'.
		// finalmente imprimir la posiciones 0 y 2;

		char mivec2[] = new char[3];

		mivec2[0] = 'A';
		mivec2[1] = 'A';
		mivec2[2] = 'B';
		System.out.println("mivec2[0] = " + mivec2[0]);

		mivec2[0] = 'Z';

		System.out.println("mivec2[0] = " + mivec2[0]);
		System.out.println("mivec2[2] = " + mivec2[2]);
		System.out.println(mivec2);
	}

}
