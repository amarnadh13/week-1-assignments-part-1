import static java.lang.System.out;
import java.util.Scanner;

public class Assignment2Program {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		out.print("Enter your first number: ");
		var num1 = scanner.nextInt();

		out.print("Enter your second number: ");
		var num2 = scanner.nextInt();
		
		out.print("Enter your third number: ");
		var num3 = scanner.nextInt();
		
		if (num1 == num2 && num1 == num3) {
			out.println("All numbers are equal");
		} else if (num1 > num2 && num1 > num3){
			out.println(num1 + " is the largest number.");
		} else if (num2 > num1 && num2 > num3) {
			out.println(num2 + " is the largest number.");
		} else {
			out.println(num3 + " is the largest number.");
		}
		scanner.close();
	}
}