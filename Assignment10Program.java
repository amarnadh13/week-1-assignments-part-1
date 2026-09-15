import static java.lang.System.out;
import java.util.Scanner;

public class Assignment10Program {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var balance = 5000.0;
        var choice = 0;

        while (choice != 4) {
            out.println("\n1. Check balance");
            out.println("2. Deposit money");
            out.println("3. Withdraw money");
            out.println("4. Exit");

            out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    out.println("Current balance: ₹" + balance);
                    break;

                case 2:
                    out.print("Enter deposit amount: ");
                    var deposit = scanner.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        out.println("Amount deposited successfully.");
                        out.println("Current balance: ₹" + balance);
                    } else {
                        out.println("Deposit amount must be positive.");
                    }
                    break;

                case 3:
                    out.print("Enter withdrawal amount: ");
                    var withdrawal = scanner.nextDouble();

                    if (withdrawal <= 0) {
                        out.println("Withdrawal amount must be positive.");
                    } else if (withdrawal > balance) {
                        out.println("Insufficient balance.");
                    } else {
                        balance -= withdrawal;
                        out.println("Amount withdrawn successfully.");
                        out.println("Current balance: ₹" + balance);
                    }
                    break;

                case 4:
                    out.println("Thank you.");
                    break;

                default:
                    out.println("Invalid menu choice.");
            }
        }

        scanner.close();
    }
}