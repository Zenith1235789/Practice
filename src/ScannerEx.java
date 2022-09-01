import java.util.Scanner;

public class ScannerEx {
	static Scanner in;

	public static void main(String[] args) {
		int value;
		in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		value = in.nextInt();
		value+=1;
		System.out.println(value);

	}
}
