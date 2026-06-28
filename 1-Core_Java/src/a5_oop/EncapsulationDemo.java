package a5_oop;

/**
 * Demonstrates:
 * Encapsulation
 */

public class EncapsulationDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Dipesh Patel", 1234567890L, 10000);

        System.out.println("Account Holder : " + account.getAccountHolderName());
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Current Balance : ₹" + account.getBalance());

        System.out.println();

        account.deposit(2500);

        System.out.println("Balance after Deposit : ₹" + account.getBalance());

        account.withdraw(1500);

        System.out.println("Balance after Withdrawal : ₹" + account.getBalance());

    }

}