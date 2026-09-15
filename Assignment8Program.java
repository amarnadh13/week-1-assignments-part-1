import static java.lang.System.out;
import java.util.Scanner;

public class Assignment8Program {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        out.print("Enter a positive integer: ");
        var number = scanner.nextInt();

        if (number <= 0) {
            out.println("Invalid number.");
        } else {
            var temp = number;
            var digitCount = 0;
            var digitSum = 0;
            var reversedNumber = 0;

            while (temp > 0) {
                var digit = temp % 10;

                digitCount++;
                digitSum += digit;
                reversedNumber = reversedNumber * 10 + digit;

                temp /= 10;
            }

            out.println("Number of digits: " + digitCount);
            out.println("Sum of digits: " + digitSum);
            out.println("Reversed number: " + reversedNumber);
        }

        scanner.close();
    }
}