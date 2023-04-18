package Fakultet;

public class Ispit extends Ocena{
	
	
	 String ispit;
	 
	 Ispit(String ispit, int oc){
		 super(oc);
		 this.ispit = ispit.substring(0,Math.min(ispit.length(), 6));
	 }
	 
	 public String sifraIspita(Ispit A) {
		
		 return A.ispit;
	 }
	 public int dohvatiOcenu(Ispit A) {
		 return A.ocena;
	 }
	 
	 public void ispisiRezultatIspita() {
		 System.out.println(sifraIspita(this)+" : "+ocenaToString(this));
	 }
	 
	 
	 

}
