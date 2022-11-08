import java.util.ArrayList;

public class Purse2 {
    private ArrayList soldi;
    public Purse2() {
        soldi = new ArrayList<>();
    }
    public void add(coin Coin) {
        soldi.add(Coin);
    }
    public double getTotal() {
        double somma = 0;
        for(int i = 0; i < soldi.size(); i++) {
            coin aCoin = (coin)soldi.get(i);
            somma += aCoin.getMeasure();
        }
        return somma;
    }
    public boolean find(coin aCoin) {
        for(int i = 0; i < soldi.size(); i++) {
            coin aCoin2 = (coin)soldi.get(i);
            if(aCoin.equals(aCoin2))
                return true;
        }
        return false;
    }
    public int count() {
        return soldi.size();
    }
    public int count(coin aCoin) {
        int count = 0;
        for(int i = 0; i < soldi.size(); i++) {
            coin aCoin2 = (coin)soldi.get(i);
            if(aCoin.equals(aCoin2))
                count++;
        }
        return count;
    }
    public double getMaximum() {
        coin aCoin = (coin) soldi.get(0);
        double max = aCoin.getMeasure();
        for(int i = 1; i < soldi.size(); i++) {
            coin aCoin2 = (coin) soldi.get(i);
            if(max <= aCoin2.getMeasure())
                max = aCoin2.getMeasure();
        }
        return max;
    }
}
