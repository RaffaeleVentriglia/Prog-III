/*
    Bilancio totale della banca
    Contare il numero di depositi
    Stampare il numero di conto corrente usando sempre 10 cifre
    Tassare i conti corrente con più di 5000 euro
    Convertire la valuta di un singolo conto corrente
 */

import java.io.*;

public class bankTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bank fineco = new bank();
        int i = 0, scelta = 0;
        double amount = 0;
        while(true) {
            System.out.println("Su quale account lavorare: ");
            i = Integer.parseInt(br.readLine());
            System.out.println("Operazione da compiere");
            scelta = Integer.parseInt(br.readLine());
            switch (scelta) {
                case 1:
                    System.out.println("Deposito");
                    amount = Integer.parseInt(br.readLine());
                    fineco.getAccount(i).deposit(amount);
                    break;
                case 2:
                    System.out.println("Prelievo");
                    amount = Integer.parseInt(br.readLine());
                    fineco.getAccount(i).withdraw(amount);
                    break;
                case 3:
                    System.out.println("Bilancio: " + fineco.getAccount(i).getBalance());
                    break;
                case 4:
                    System.out.println("Bilancio Totale: " + fineco.getTotalBalance());
                    break;
            }
        }
    }
}
