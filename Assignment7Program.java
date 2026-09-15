import static java.lang.System.out;
import java.util.Scanner;

public class Assignment7Program {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        out.print("Enter a positive integer: ");
        var number = scanner.nextInt();

        if (number > 0) {
            for (var i = 1; i <= 10; i++) {
                out.println(number + " x " + i + " = " + (number * i));
            }
        } else {
            out.println("Invalid number.");
        }

        scanner.close();
    }
}