import java.util.Scanner;

public class Recurrsion {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = myObj.nextInt();
		long factorial = multiplyNumbers(number);
		System.out.println("Factorial of "+number+" = "+factorial);
		
		if(number%2==0) {
			System.out.println("Using Recursion " +multiplyNumbers(number)); 
		}else {
			System.out.println("Using for loop "+anotherMethod(number)); 
		}
		myObj.close();

	}
	
	public static int multiplyNumbers(int number) {
		if(number>0) {
			return number*multiplyNumbers(number-1);
		}else {
			return 1;
		}
	}
	
	public static int anotherMethod(int number) {
		int factorial = 1;
		for (int i = number; i >= 1; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
