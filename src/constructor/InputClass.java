package constructor;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		Recursion recursion = new Recursion(n);
		System.out.println(recursion.n);

		Iteration iteration = new Iteration(n);
		int b = iteration.calculationMethod();
		System.out.println("Iteration" + b);
		sc.close();
	}

}
