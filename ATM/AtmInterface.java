package ATM;

import java.util.Scanner;

public class AtmInterface {

    private Bank bank;
    private static final int PIN = 1234; // Define PIN as a constant for validation

    public AtmInterface(Bank bank) {
        this.bank = bank;
    }

    public void display() {
        Scanner sc = new Scanner(System.in);
        while (true) {
        	   System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Welcome to the ATM");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("-------------------------------------------------------------------------------");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(sc);
                    break;
                case 3:
                    withdraw(sc);
                    break;
                case 4:
                	   System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("Thank you for using the ATM.");
                    System.out.println("-------------------------------------------------------------------------------");
                    sc.close();
                    return;
                default:
                	   System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("Invalid Option. Please try again.");
                    System.out.println("-------------------------------------------------------------------------------");
            }
        }
    }

    private void checkBalance() {
        System.out.println("Account Balance: $" + bank.getCash());
    }

    private void deposit(Scanner sc) {
        System.out.println("Enter the amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            bank.depositeAmount(amount);
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Successfully deposited: $" + amount);
            System.out.println("-------------------------------------------------------------------------------");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private void withdraw(Scanner sc) {
        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int option = sc.nextInt();
        switch (option) {
            case 1:
               Withdrawal_Accounttype(sc, "Savings Account");
                break;
            case 2:
            	Withdrawal_Accounttype(sc, "Current Account");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    private void Withdrawal_Accounttype(Scanner sc, String accountType) {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(accountType);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > 0 && bank.withdrawAmount(amount)) {
            System.out.println("Enter your PIN: ");
            int pin = sc.nextInt();
            if (pin == PIN) {
                System.out.println("Correct pin");
            } else {
                System.out.println("Incorrect PIN.");
            }
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Successfully withdrew: $ " + amount+" Thank you!" );
        System.out.println("-------------------------------------------------------------------------------");
    }
}
