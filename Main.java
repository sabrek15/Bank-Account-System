public class Main {
    public static void main(String[] args) {
        SavingsAccount mySavings1 = new SavingsAccount("Alex", 500, 5.0);
        mySavings1.addInterest();
        System.out.println("Savings Balance: " + mySavings1.getBalance());

        System.out.println("-------------------");

        CheckingAccount myChecking = new CheckingAccount("John", 500.0);
        myChecking.withdraw(100.0); 
        System.out.println("Checking Balance: " + myChecking.getBalance());

        // BankAccount generic = new BankAccount("Test", 0); // <--- UNCOMMENT THIS TO SEE THE ERROR!

    }
}