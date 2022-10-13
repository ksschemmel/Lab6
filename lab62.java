import java.util.Scanner;
public class lab62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Length of side A: ");
		int A = scan.nextInt();
		System.out.println("Enter Length of side C: ");
		int C = scan.nextInt();
		System.out.println("Enter Length of the Hypotenuse: ");
		int P = scan.nextInt();
		
		if(Math.pow(P, 2)==(Math.pow(A, 2)+ (Math.pow(C, 2)))) {
			System.out.println("The triangle is a right traingle");
		}
		else
		{
			System.out.println("The triangle is not a right triangle");
		}
		
	}

}
