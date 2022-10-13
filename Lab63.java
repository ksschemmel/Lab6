import java.util.Scanner;
public class Lab63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width:");
		int W = scan.nextInt();
		System.out.println("Enter the Length:");
		int L = scan.nextInt();
		
		if(W==L) {
			System.out.println("It is a Square");
				}
		else
			{
				System.out.println("it is a Rectangle");
			}
		}
	}


