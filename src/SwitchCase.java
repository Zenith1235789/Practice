import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int number = sc.nextInt();
		switch (number) {
		  case 1:
		    System.out.println("0");
		    break;
		  case 2:
			    System.out.println("1");
			    break;
		  case 3:
			    System.out.println("3");
			    break;
		  case 4:
			    System.out.println("4");
			    break;
		   default :
			System.out.println("NA");
		}
		sc.close();

	}

}
