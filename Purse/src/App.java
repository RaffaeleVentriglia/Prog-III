public class App {
    public static void main(String[] args) {
        Purse p1 = new Purse();
        p1.addNickel(5);
        p1.addDimes(10);
        p1.addQuarter(25);
        System.out.println("Totale: £" + p1.getTotal());
    }
}
