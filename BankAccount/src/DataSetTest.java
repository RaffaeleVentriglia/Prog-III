public class DataSetTest {
    public static void main(String[] args){
    
        DataSet bankData = new DataSet();
    
        bankData.add(new bankAccount(250));
        bankData.add(new bankAccount(500));
        bankData.add(new bankAccount(100));
        Measurable max = bankData.getMaximum();

        System.out.println("\nSomma dei bilanci: " + bankData.getSum());
        System.out.println("Bilancio più alto: " + max.getMeasure());
        System.out.println("La media è : " + bankData.getAverage());

        DataSet bankData2 = new DataSet();

        bankData2.add(new coin(20, "Carmine"));
        bankData2.add(new coin(800, "Vincenzo"));
        bankData2.add(new coin(400, "FrancescoCamastra"));
        max = bankData2.getMaximum();

        System.out.println("\nTotale dei soldi: " + bankData2.getSum());
        System.out.println("Soldi massimi: "+ max.getMeasure());
        System.out.println("La media è : " + bankData2.getAverage());
    
    }
}