public class Purse {
    private static final double NICKEL_VALUE = 0.05;
    private static final double DIME_VALUE = 0.1;
    private static final double QUARTER_VALUE = 0.25;

    private int nickelQt = 0;
    private int dimeQt = 0;
    private int quarterQt = 0;

    public void addNickel(int n) {
        nickelQt = nickelQt + n;
    }

    public void addDimes(int n) {
        dimeQt = dimeQt + n;
    }

    public void addQuarter(int n) {
        quarterQt = quarterQt + n;
    }

    public double getTotal() {
        return nickelQt * NICKEL_VALUE + dimeQt * DIME_VALUE + quarterQt * QUARTER_VALUE;
    }
}
