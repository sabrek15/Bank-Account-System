public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String name, double amount, double rate) {
        super(name, amount);
        this.interestRate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Interest added: $" + interest);
    }
}