public class checkingAccountTest {
    public static void main(String[] args) {
        checkingAccount account = new checkingAccount(0);
        account.deposit(200);
        account.deposit(200);
        account.withdraw(250);
        account.deposit(200);
        account.deposit(200);
        account.deposit(200);
        account.withdraw(250);
        account.deductFees();
        System.out.println("Bilancio: " + account.getBalance());
    }
}
