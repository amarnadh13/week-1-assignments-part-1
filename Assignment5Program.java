import static java.lang.System.out;
import java.util.Scanner;

public class Assignment5Program {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        out.print("Enter the day number: ");
        var day = scanner.nextInt();

        if (day == 1) {
            out.println("Monday");
        } else if (day == 2) {
            out.println("Tuesday");
        } else if (day == 3) {
            out.println("Wednesday");
        } else if (day == 4) {
            out.println("Thursday");
        } else if (day == 5) {
            out.println("Friday");
        } else if (day == 6) {
            out.println("Saturday");
        } else if (day == 7) {
            out.println("Sunday");
        } else {
            out.println("Invalid day number");
        }
        scanner.close();
    }
}