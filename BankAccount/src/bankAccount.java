public class bankAccount extends Exception implements Measurable {
    private double bilancio;
    private static int id = 0;
    private int accountNumber;
    private int NumDepositi;
    
    public bankAccount(double bilancioIniziale) {
        id++;
        accountNumber = id;
        this.bilancio = bilancioIniziale;
    }

    public bankAccount() {
        this(0);
    }

    public void deposit(double amount) {
        double newBalance = this.bilancio + amount;
        this.bilancio = newBalance;
        NumDepositi++;
    }  
    
    public void withdraw(double amount) {
        double newBalance = this.bilancio - amount;
        try {
            if(newBalance <= 0) {
                throw new NoFundsException();
            } else {
                this.bilancio = newBalance;
            }
        } catch (NoFundsException exc) {
            System.out.println(exc.toString());
        }
    }

    public int getNumDep() {
        return this.NumDepositi;
    }

    public double getBalance() {
        return this.bilancio;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public double getMeasure() {
        return bilancio;
    }
}