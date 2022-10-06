public class savingsAccount extends bankAccount {
    private double interestRate;

    public savingsAccount(double interest) {
        this.interestRate = interest;
    }
    public savingsAccount() {
        this(1.5);
    }
    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }
}
