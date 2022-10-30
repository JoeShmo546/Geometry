import java.util.Scanner;
import java.lang.*;

public class Circle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("This is a program that will print the area and circumferance of a circle. Just enter the radius.");
		System.out.println("Radius: ");
		
		int r = scanner.nextInt();
		double a = Math.PI*(Math.pow(r, 2));
		
		System.out.println("The area is: "+ a);
		
		double c = 2 * Math.PI * r;
		
		System.out.println("The circumferance is: "+ c);
		
	}

}
