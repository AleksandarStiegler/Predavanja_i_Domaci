package Student;

public class Student {
	
	String ime;
	String prezime;
	String adresa;
	int brojindeksa;
	
	Student(String i, String p, String a, int bri){
		this.ime = i;
		this.prezime = p;
		this.adresa = a;
		this.brojindeksa = bri;
	}
	
	public void ispisi() {
		System.out.println("Student : \t"+ime+"\t"+prezime+"\t"+adresa+"\t"+brojindeksa);
	}

}
