import static java.lang.System.out;
import java.util.Scanner;

public class Assignment6Program {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        out.print("Enter first number: ");
        var num1 = scanner.nextDouble();

        out.print("Enter operator (+, -, *, /, %): ");
        var operator = scanner.next().charAt(0);

        out.print("Enter second number: ");
        var num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                out.println("Result: " + (num1 + num2));
                break;

            case '-':
                out.println("Result: " + (num1 - num2));
                break;

            case '*':
                out.println("Result: " + (num1 * num2));
                break;

            case '/':
                if (num2 == 0) {
                    out.println("Cannot divide by zero.");
                } else {
                    out.println("Result: " + (num1 / num2));
                }
                break;

            case '%':
                if (num2 == 0) {
                    out.println("Cannot find remainder with zero.");
                } else {
                    out.println("Result: " + (num1 % num2));
                }
                break;

            default:
                out.println("Invalid operator.");
        }

        scanner.close();
    }
}