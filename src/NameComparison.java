import java.util.Scanner;

public class NameComparison {

	public static void main(String[] args) {
		Scanner Name = new Scanner(System.in);
		System.out.print("Name1: ");
		String Name1 = Name.next();
		
		System.out.print("Name2: ");
		String Name2 = Name.next();
		
		if (Name1.equals(Name2)) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}
		Name.close();

	}

}
