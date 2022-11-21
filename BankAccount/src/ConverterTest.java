public class ConverterTest {
    public static void main(String[] args) {
        bankAccount bank = new bankAccount();
        bank.deposit(1500);
        EURConvert convertitore = new EURConvert();
        System.out.println("Conversione di 2$ = €" + convertitore.Convert(2));
        System.out.println("Conversione di 2$ = YEN " + bank.getJPY(2));
        System.out.println("Conversione di 2$ = £" + bank.getGBP(2));

        System.out.println("Bilancio ");
        bank.ConvertTo(Currency.EURO);
        System.out.println("Bilancio ");
        bank.ConvertTo(Currency.YEN);
        System.out.println("Bilancio " );
        bank.ConvertTo(Currency.STERLINE);
    }
}
