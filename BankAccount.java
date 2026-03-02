public abstract class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String name, double startingBalance) {
        this.ownerName = name;
        this.balance = startingBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Error: cannot deposit negative money!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Balance withdrawn: $" + amount);
        } else {
            System.out.println("Error: Insufficient Balance");
        }
    }
}