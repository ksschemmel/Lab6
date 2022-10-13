import java.util.Scanner;
import java.text.NumberFormat;
public class Lab64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of Classes Held: ");
		double held = scan.nextInt();
		System.out.println("Number of Classes attended: ");
		double attended = scan.nextInt();
		double percent=attended/held;
		
		if (percent <75) {
			System.out.println("You are not allowed to take the exam.");
		}
		else {
			System.out.println("You are allowed to take the exam.");
		}
		
		
	}

}
