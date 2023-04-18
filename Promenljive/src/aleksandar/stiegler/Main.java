package aleksandar.stiegler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		byte b = 123;
	    System.out.println("vrednost promenljive b je: "+b);
	    
	    short s = 12345;
	    System.out.print("Vrednost promenljive s je: "+s);
	    
	    int i = 1234567891;
	    System.out.println("vrednost promenljive i je: "+i);
	   
	    long l = 1234567891234567891l;
	    System.out.println("vrednost promenljive l je: "+l);
	    
	    long ll = 1234_5678_9012_12l;
	    /* _ je dozovoljena kod tipa long da bi 
	    vrednost bila preglednija ne pamti se u memoriji */
	    
	    System.out.println("vrednost promenljive ll je: "+ll);
	    
	    float f = 25.05f;
	    System.out.println("vrednost promenljive f je: " +f);
	    
	    /* Inicijalizacija se zavrsava sa slovom F ili f 
	     * Java je strogo tipiziran jezik i osetljiv je na mala 
	     * i velika slova, ali je za float ok i malo i veliko F
	     * za naglasavanje tipa promenljive
	     */
	    float F = 123.123f;
	    System.out.println("vrednost promenljive F je: "+F);
	    
	    double d = 12345.12345;
	    System.out.println("vrednost promenljive d je:"+d);
	    
	    boolean bln = true; 
	    boolean blen = false;
	    System.out.println(bln);
	    System.out.println(blen);
	    
	    char znak = '%';
	   	System.out.println(znak);
	    
	}
	
	
	

}