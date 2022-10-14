public class bank extends bankAccount{
    private static savingsAccount[] account;
    private double TotalBalance = 0;
    private int NumDepositi = 0;

    public bank() {
        account = new savingsAccount[3];
        buildArray();
    }

    public void buildArray() {
        for (int j = 0; j < account.length; j++) {
            account[j] = new savingsAccount(50);
        }
    }

    public savingsAccount getAccount(int i) {
        return account[i];
    }

    public double getTotalBalance() {
        for (int j = 0; j < account.length; j++) {
            TotalBalance += account[j].getBalance();
        }
        return TotalBalance;
    }

    public int getNumDepositi() {
        for (int j = 0; j < account.length; j++) {
            NumDepositi += account[j].getNumDep();
        }
        return NumDepositi;
    }

    public void addTax() {
        for (int j = 0; j < account.length; j++) {
            if(account[j].getBalance() > 5000) {
                account[j].withdraw(account[j].getBalance() - account[j].getBalance() * 0.2);
                System.out.println("Utente n." + account[j].getAccountNumber() + " è stato tassato");
            }
        }
    }

    public void printAccountsNumber() {
        for (int i = 0; i < account.length; i++) {
            String str = String.format("%010d", account[i].getAccountNumber());
            System.out.println(str);
        }
    }
}