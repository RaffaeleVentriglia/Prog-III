/*
 * abbiamo un conto condiviso con la nostra famiglia
 * ed abbiamo N carte associate al nostro conto.
 * La banca deve tutelarsi per evitare frodi nei prelievi
 * e depositi. Modificare bankAccount e scegliere due metodi
 * diversi di sincronizzazione tra quelli possibili:
 *  sincronizzare il metodo deposit ed il metodo withdraw
 *  per proteggere la variabile balance.
 *  Creare N thread che effettuano la stessa operazione
 */


public class ThreadTest implements Runnable {
    public ThreadTest() {
        Thread th = Thread.currentThread();
        th.setName("Thread Principale");
        Thread f1 = new Thread(this, "Thread Figlio 1");
        Thread f2 = new Thread(this, "Thread Figlio 2");
        f1.start();
        f2.start();
    }

    @Override
    public void run() { account1.deposit(250); }

    public static void main(String args[]) {
        new ThreadTest();
        System.out.println(account1.getBalance());
    }

    static bankAccount account1 = new bankAccount();
}