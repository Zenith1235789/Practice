import java.util.Scanner;

public class Everything {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number: ");
		int inputVariable = sc.nextInt();
		int factorialValue = calculationMethod(inputVariable);
		printMethod(factorialValue);
		sc.close();

	}

	public static int calculationMethod(int inputVariable) {
		int factorial = 1;
		for (int i = inputVariable; i >= 1; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void printMethod(int factorialValue) {
		System.out.println(factorialValue);
	}
}
