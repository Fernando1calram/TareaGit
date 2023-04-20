package tareaGit;

import java.util.Scanner;

public class SoloSuma {

	public static void main(String[] args) {
		
		Scanner teclado =new Scanner (System.in);
		
		System.out.println("Introduce el primer numero");
		int n1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo numero");
		int n2 = teclado.nextInt();
		
		System.out.println(n1 + " + " + n2 + " = " + n1+n2);
	}

}
