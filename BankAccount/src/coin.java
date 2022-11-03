public class coin implements Measurable{

    public coin(double amm){
        value = amm;
    }

    @Override
    public double getMeasure() {
        return value;
    }

    private double value;
}