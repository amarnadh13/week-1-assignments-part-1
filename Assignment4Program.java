import static java.lang.System.out;
import java.util.Scanner;

public class Assignment4Program {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        out.print("Enter the year: ");
        var year = scanner.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            out.println(year + " is a leap year.");
        } else {
            out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}