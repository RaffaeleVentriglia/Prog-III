import javax.swing.JOptionPane;
import java.io.IOException;

public class PurseTest {
    public static void main(String[] args) throws IOException {
        Purse p1 = new Purse();
        int count;
        String input;

        input = JOptionPane.showInputDialog("Inserire nickel");
        count = Integer.parseInt(input);
        p1.addNickel(count);
        input = JOptionPane.showInputDialog("Inserire Dime");
        count = Integer.parseInt(input);
        p1.addDimes(count);
        input = JOptionPane.showInputDialog("Inserire quarter");
        count = Integer.parseInt(input);
        p1.addQuarter(count);
        System.out.println("Totale: £" + p1.getTotal());
    }
}