public class checkingAccount extends bankAccount{
    private int FREE_TRANSACTION = 3;
    private double TRANSACTION_FEE = 15.0;
    private int transactionCount;

    public checkingAccount(int initialBalance) {
        super(initialBalance);
        transactionCount = 0;
    }

    @Override
    public void deposit(double amount) {
        transactionCount++;
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        transactionCount++;
        super.withdraw(amount);
    }

    public void deductFees() {
        if(transactionCount > FREE_TRANSACTION) {
            double fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTION);
            super.withdraw(fees);
            transactionCount = 0;
            System.out.println("Commissione applicata");
        }
    }
}
