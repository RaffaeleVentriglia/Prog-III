public class bankAccountTest {
    public static void main(String args[]) {
        bankAccount account = new bankAccount(); 
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Saldo disponibile: " + account.getBalance());
        account.deposit(145.50);
        System.out.println("Saldo disponibile: " + account.getBalance());
        account.withdraw(25.50);
        System.out.println("Saldo disponibile: " + account.getBalance());

        System.out.println("SavingsAccount");
        savingsAccount account2 = new savingsAccount();
        account2.deposit(100);
        account2.addInterest();
        System.out.println("Saldo disponibile: " + account2.getBalance());

        // * prova dell'eccezione dei fondi mancanti
        bankAccount bancarotta = new bankAccount();
        bancarotta.deposit(10);
        bancarotta.withdraw(20);
    }
}