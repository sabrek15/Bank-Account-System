public class CheckingAccount extends BankAccount {
    public CheckingAccount(String name, double amount) {
        super(name, amount);
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + 1;
        
        System.out.println("Applying $1 checking fee...");

        super.withdraw(totalAmount);
    }
}