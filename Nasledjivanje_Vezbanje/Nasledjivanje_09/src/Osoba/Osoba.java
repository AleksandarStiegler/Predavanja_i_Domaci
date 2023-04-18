package Osoba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Osoba {
	
	private String ime = "N";
	private String prezime = "N";
	private int starost = 0;
	
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getStarost() {
		return starost;
	}
	
	public void setIme() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite ime");
		String i = bfr.readLine();
		try {
			if (i.isBlank() || i.isEmpty()) {
				throw new Izuzetak ("Ime ne moze ostati prazno");
			}
			else {
				this.ime = i;
			}
		}catch (Izuzetak e) {
			System.out.println(e.getMessage()+" . Unesite ponovo!");
			setIme();
		}
	}
	
	public void setPrezime()throws Exception{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite prezime");
		String p = bfr.readLine();
		if (p.isBlank() || p.isEmpty()) {
			System.out.println("Prezime ne moze biti prazno. Unesite ponovo!");
			setPrezime();
		}else {
			this.prezime = p;
		}
	}
	
	public void setStarost() throws Exception{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite starost");
		try {
			int st = Integer.parseInt(bfr.readLine());
		
				if (st > 0 && st < 140) {
					this.starost = st;
				}
				else {
					System.out.println("Starost moze biti od 1 do 139. Unesite ponovo !");
			
				setStarost();
			}
		}catch(Exception e) {
			System.out.println("Pogresan unos, mozete uneti samo celobrojnu vrednost");
			setStarost();
		}
	}

}
