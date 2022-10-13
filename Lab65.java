import java.util.Scanner;
public class Lab65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = 4;
		int num2 = 6;
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 was 4");
		System.out.println("num2 was 6");
		System.out.println("After Swapping num1 = " + num1);
		System.out.println("After Swapping num2 = " + num2);
		
	}

}
