package Stringovi;

public class Main1 {

	// String (char chars[], 
	public static void main(String[] args) {

		char ch[] = {'J','A','V','A'};
		
		String s = new String(ch,2,2);
		
		System.out.println(" String = "+s);
		//String s1 = 2023; // greska
		String s1 = " "+2015;
		System.out.println(s1);
	}

}
