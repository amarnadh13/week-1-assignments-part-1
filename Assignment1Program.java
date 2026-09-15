import static java.lang.System.out;
import java.util.Scanner;

class Assignment1Program {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		out.print("Enter your number: ");
		var num = scanner.nextInt();
		
		var status1 = num > 0;
		var status2 = num < 0;
		var remainder = num %2 == 0;
		
		if (num == 0) {
			out.println("The number is zero.");
		} else if (status1) {
			out.print("The number is positive");
			if (remainder) {
				out.println("and an even.");
			} else {
				out.println("and an odd.");
			}
		} else if (status2) {
			out.print("The number is negative");
			if (remainder) {
				out.println("and an even.");
			} else {
				out.println("and an odd.");
			}
		}
		scanner.close();
	}
}