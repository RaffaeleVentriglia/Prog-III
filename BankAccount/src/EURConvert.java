public class EURConvert implements CurrencyConverter {
    @Override
    public double Convert(double value) {
        return value * 0.97;
    }
}
