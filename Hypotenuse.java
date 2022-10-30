import java.util.Scanner;
import java.lang.Math;

public class Hypotenuse {

	public static void main(String[] args) {
		
		System.out.println("This is a program that will tell you the hypotenuse of any triangle. Just enter in the lengths of both legs");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter in leg 1 :" );
		int leg1 = scanner.nextInt();
		System.out.println("Enter in leg 2 :");
		int leg2 = scanner.nextInt();
		
		double hyp = Math.sqrt( leg1 * leg1 + leg2 * leg2);
		
		System.out.println("The Hypotenuse is: "+ hyp);
	}

}
