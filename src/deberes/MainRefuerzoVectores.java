package deberes;

public class MainRefuerzoVectores {

	public MainRefuerzoVectores() {

	}

	public static void main(String[] args) {

//		 1. Declarar un vector x de 8, tipo int.

		int x[] = new int[8];

//		 2. declarar un vector y(3)de tipo char y asignar
//		 la posicion 2 el valor de A.

		char y[] = new char[3];
		y[2] = 'A';

//		3. Declarar un vector A(5) de tipo int y asignar la opcion 0 el valor 
//		de 25, posicion 3 el valor de 49 y la posicion 2 el 
//		valor de 0.

		int A[] = new int[5];
		A[0] = 25;
		A[3] = 49;
		A[2] = 0;

//		4. Declarar un vector Z(12) de tipo int y asignar a todos sus valores  que inician 
//		desde 1 en forma secuencial.

		int Z[] = new int[12];
		Z[0] = 1;
		Z[1] = 2;
		Z[2] = 3;
		Z[3] = 4;
		Z[4] = 5;
		Z[5] = 6;
		Z[6] = 7;
		Z[7] = 8;
		Z[8] = 9;
		Z[9] = 10;
		Z[10] = 11;
		Z[11] = 12;

//		5. Declarar un vector B(10) de tipo int y asignar en la posicion B[0] asignele el 
//		valor A[3] del ejercio anterio.

		int B[] = new int[10];
		B[0] = A[3];

//		6. Declarar un vector c(10) de tipo int y asignar a todos sus posiciones valores impares que
//		inician desde 1 y son secuanciales.

		int C[] = new int[10];
		C[0] = 1;
		C[1] = 3;
		C[2] = 5;
		C[3] = 7;
		C[4] = 9;
		C[5] = 11;
		C[6] = 13;
		C[7] = 15;
		C[8] = 17;
		C[9] = 19;

//		7. Declarar un vecor H(10) tipo char y asignar a  las posiciones imaperes letras que inician en A 
//		secuencialmente.

		char H[] = new char[10];
		H[1] = 'A';
		H[3] = 'B';
		H[5] = 'C';
		H[7] = 'D';
		H[9] = 'E';

//		8. Declara un vector F(10) tipo char y en base al ejercicio anterior asignar los valores de las siguiente manera:  
//			F[0]= H[3]  F[3]= H[2] F[4]= H[6] F[7]= H[0]  F[8]= H[1]  F[9]= H[9].  

		char F[] = new char[10];
		F[0] = H[3];
		F[3] = H[2];
		F[4] = H[6];
		F[7] = H[0];
		F[8] = H[1];
		F[9] = H[9];

//		9. Declarar un vector  L(15) tipo int y asignar valores en base a lo siguiente :  L[0]= pomedio de 3, 5, 7, 9)     
//      L[7]= multiplicacion de 6 , 7 y 3)    L[10] division de 10/2).

		int L[] = new int[15];
		L[0] = (3 + 5 + 7 + 9) / 4;
		L[7] = (6 * 7 * 3);
		L[10] = 10 / 2;

//		10. Declarar vector N(12) tipo int y realizar las sigueintes asignaciones:  N[0]= (promedio de 3, 10 y 9 )    
//		N[4]= (suma de 7, 8 y10)     N[12]= (multiplicaion de 5,7 y 3) N[20] = (la suma de 7, -3 y 8 )  
//		N[20]= (suma de 7, -3 y 8)  en la ultima posicion el valor de 20/4.

		int N[] = new int[12];
		N[0] = (3 + 10 + 9) / 3;
		N[4] = 7 + 8 + 10;
		N[12] = 5 * 7 * 3; // --->Esta posicion no existe.
		N[20] = 7 + (-3) + 8;// --->Esta posicion no existe.
		N[11] = 20 / 4;
	}

}
