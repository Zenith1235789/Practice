import java.util.Scanner;

public class ScannerExample1 {
	static Scanner in;

	public static void main(String[] args) {
		int value;
		in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		value = in.nextInt();
		System.out.println(value++);

	}
}
