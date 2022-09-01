import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = myObj.nextInt();

		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		myObj.close();
	}

}
