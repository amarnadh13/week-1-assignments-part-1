import static java.lang.System.out;
import java.util.Scanner;

public class Assignment3Program {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        out.print("Enter your marks: ");
        var marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            out.println("Invalid mark.");
        } else if (marks >= 90) {
            out.println("You have got grade A.");
        } else if (marks >= 80) {
            out.println("You have got grade B.");
        } else if (marks >= 70) {
            out.println("You have got grade C.");
        } else if (marks >= 60) {
            out.println("You have got grade D.");
        } else {
            out.println("You have got grade F.");
        }

        scanner.close();
    }
}