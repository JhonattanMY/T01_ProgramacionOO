package diagramas_flujo;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		Scanner lector=new Scanner(System.in);

		
		System.out.println("---Ingrese dos numeros---");
		System.out.print("A: ");
		int A=lector.nextInt();
		System.out.print("B: ");
		int B=lector.nextInt();
		
		int s= A+B;
		int r= A-B;
		int m= A*B;
		double d= A/B;
		
		System.out.println("------------------------");
		System.out.println("Suma es: "+s);
		System.out.println("Resta es: "+r);
		System.out.println("Multiplicacion es: "+m);
		System.out.println("Division es: "+d);
		
		
		
	}

}
