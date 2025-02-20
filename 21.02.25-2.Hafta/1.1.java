import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Password Registration: ");
        int password = scanner.nextInt();

        System.out.print("Enter Password: ");
        int passwordEntered = scanner.nextInt();
        int balance = 10000;

        if (password == passwordEntered) {
            System.out.println("Password Match\nSelect the action");

            while (true) {
                System.out.println("1. Balance Viewing\n2. Deposit\n3. Withdraw\n4. Exit");
                int action = scanner.nextInt();

                if (action == 1) {
                    System.out.println("Balance: " + balance);
                }
                else if (action == 2) {
                    System.out.print("Enter the amount to deposit: ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println("New Balance: " + balance);
                }
                else if (action == 3) {
                    System.out.print("Enter the amount to withdraw: ");
                    int withdraw = scanner.nextInt();

                    if (withdraw > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        balance -= withdraw;
                        System.out.println("New Balance: " + balance);
                    }
                }
                else if (action == 4) {
                    System.out.println("Exiting... Thank you!");
                    break;
                }
                else {
                    System.out.println("Invalid action. Try again.");
                }
            }
        }
        else {
            System.out.println("Password Mismatch");
        }

        scanner.close();
    }
}
