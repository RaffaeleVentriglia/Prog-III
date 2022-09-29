public class App {
    public static void main(String args[]) {
        bankAccount account = new bankAccount();
        bankAccount account2 = new bankAccount();
        bankAccount account3 = new bankAccount();

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Saldo disponibile: " + account.getBalance());
        account.deposit(1245.50);
        System.out.println("Saldo disponibile: " + account.getBalance());
        account.withdraw(125.50);
        System.out.println("Saldo disponibile: " + account.getBalance());

        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Saldo disponibile: " + account2.getBalance());
        account2.deposit(1245.50);
        System.out.println("Saldo disponibile: " + account2.getBalance());
        account2.withdraw(125.50);
        System.out.println("Saldo disponibile: " + account2.getBalance());

        System.out.println("Account Number: " + account3.getAccountNumber());
        System.out.println("Saldo disponibile: " + account3.getBalance());
        account3.deposit(1245.50);
        System.out.println("Saldo disponibile: " + account3.getBalance());
        account3.withdraw(125.50);
        System.out.println("Saldo disponibile: " + account3.getBalance());
    }
}