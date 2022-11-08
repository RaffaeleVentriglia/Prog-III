public class coin implements Measurable {

    public coin(double amm, String n){
        name = n;
        value = amm;
    }

    @Override
    public double getMeasure() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object otherObject) {
        coin other = (coin) otherObject;
        return this.value == other.value && this.name.equals(other.getName());
    }

    private String name;
    private double value;
}