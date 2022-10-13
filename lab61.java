import java.util.Scanner;
public class lab61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scan.nextLine();
		int length = word.length();
		if (length %2==0) {
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
			
		}

	}


