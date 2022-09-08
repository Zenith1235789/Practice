import java.util.Scanner;

public class methodImplementation {

	public static void main(String[] args) {
		Scanner Num = new Scanner(System.in);
		System.out.print("Input Number: ");
		int EvenOdd = Num.nextInt();
		if (EvenOdd % 2 == 0) {
			Even();
		} else {
			Odd();
		}
		Num.close();
	}

	public static void Odd() {
		System.out.println("Odd");
	}

	public static void Even() {
		System.out.println("Even");
	}

}
