// BankAccount.java
public class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
System.out.println("helle");
