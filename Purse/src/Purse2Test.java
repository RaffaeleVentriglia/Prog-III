public class Purse2Test {
    public static void main(String [] args) {
        Purse2 coins = new Purse2(); 
	    coins.add(new coin(10,"m_1"));
	    coins.add(new coin(20,"m_2"));
	    coins.add(new coin(30,"m_3"));
	    //System.out.println(coins.getMaximum().getValue()); 	
	    System.out.println(coins.find(new coin(30,"m_3")));
    }
}