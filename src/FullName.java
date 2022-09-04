import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		Scanner FName = new Scanner(System.in);
		System.out.print("First Name: ");
		String FirstName = FName.next();
		
		System.out.print("Last Name: ");
		String LastName = FName.next();
		System.out.println("My Full Name is "+FirstName +" " + LastName);
		
		System.out.print("Full Name: ");
		String FullName = FName.nextLine();
		System.out.println("My Full Name is "+FullName);
		FName.close();
			

	}

}
