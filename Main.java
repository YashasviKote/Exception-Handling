import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            BankAccount account = new BankAccount(5000);

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: "
                    + account.getBalance());

        } catch (InputMismatchException e) {

            System.out.println("Invalid input! Enter numbers only.");

        } catch (InsufficientBalanceException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Transaction complete.");
        }
    }
}