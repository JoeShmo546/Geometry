import java.util.*;
import java.lang.*;

public class CtoF {

	public static void main(String[] args) {
		
		System.out.println("This is a program that converts Celsius to Fahrenheit or Fahrenheit to Celsius");
		System.out.println("Just enter in c for Celsius or f for Fahrenheit to chose which you want to convert from: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String T = scanner.nextLine();
		String C = "c";
		String F = "f";
		
			if(T.equals(C)) {
				System.out.println("Now enter in the temerature: ");
				double Ct = scanner.nextDouble();
				double Ca = (Ct * 9/5) + 32;
				System.out.println("Fahrenheit is: "+ Ca +"°");
			}if(T.equals(F)) {
				System.out.println("Now enter in the temerature: ");
				double Ft = scanner.nextDouble();
				double Fa = ((Ft - 32)*5)/9;
				System.out.println("Celsius is: "+ Fa +"°");
			}if(!T.equals(C)&&!T.equals(F)){
				System.out.println("That was not one of the options");
			}

	}

}
