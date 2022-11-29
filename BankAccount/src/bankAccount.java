import java.lang.Thread;

public class bankAccount extends Exception implements Measurable {
    private double bilancio;
    private static int id = 0;
    private int accountNumber;
    private int NumDepositi;
    private static double DOLLAR = 0.97;
    
    public bankAccount(double bilancioIniziale) {
        id++;
        accountNumber = id;
        this.bilancio = bilancioIniziale;
    }

    public bankAccount() { this(0); }

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

    public int getNumDep() { return this.NumDepositi; }

    public double getBalance() { return this.bilancio; }

    public int getAccountNumber() { return this.accountNumber; }

    @Override
    public double getMeasure() { return bilancio; }

    public double convert() { return getBalance() * DOLLAR; }

    CurrencyConverter JPYConverter = new CurrencyConverter() {
        @Override
        public double Convert(double value) {
            return value * 139.96;
        }
        
    };

    CurrencyConverter GBPConverter = new CurrencyConverter() {
        @Override
        public double Convert(double value) {
            return value * 0.85;
        }
    };

    public double getJPY(double value) { return JPYConverter.Convert(value); }
    public double getGBP(double value) { return GBPConverter.Convert(value); }

    private EURConvert euro = new EURConvert();
    public void ConvertTo(Currency value) {
        switch(value) {
            case EURO:
                System.out.println("Convertito in Euro: " + euro.Convert(getBalance()));
                break;
            case STERLINE:
                System.out.println("Convertito in Sterline: " + GBPConverter.Convert(getBalance()));
                break;
            case YEN:
                System.out.println("Convertito in Yen: " + JPYConverter.Convert(getBalance()));
                break;
            default:
                System.out.print("Conversione non consentita");
                break;
        }
    }
}