public class bankAccount {
    private double bilancio;
    private static int id = 0;
    private int accountNumber;
    
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
    }  
    
    public void withdraw(double amount) {
        double newBalance = this.bilancio - amount;
        if (newBalance <= 0) {
            System.out.println("Errore, non ci sono abbastanza fondi");
            return;
        }
        this.bilancio = newBalance;
    }

    public double getBalance() {
        return this.bilancio;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}