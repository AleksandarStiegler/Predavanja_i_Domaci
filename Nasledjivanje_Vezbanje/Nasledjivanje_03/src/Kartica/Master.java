package Kartica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Master extends Kartica{
	
	private int pinKod;
	
	Master(String tk, String iv, int pk){
		super(tk, iv);
		this.pinKod = pk;
	}
	
	public void promeniPinKod() throws Exception{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unesite novi pin");
			pinKod = Integer.parseInt(bfr.readLine());
		}catch(Exception e) {
			System.out.println("Greska: Unesite samo cele brojeve!");
			promeniPinKod();
		}
		
	}
	
	public void prikaziPodatkeKartice() {
		super.ispisi();
		System.out.println("Pin kod ove kartice je "+pinKod);
	}

}
