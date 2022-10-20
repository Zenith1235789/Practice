package classAndObject;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		Recursion recursion = new Recursion();
		int fact = recursion.factorial(n);
		System.out.println("Recursion" + fact);

		Iteration iteration = new Iteration();
		int b = iteration.calculationMethod(n);
		System.out.println("Iteration" + b);
		sc.close();
	}

}
