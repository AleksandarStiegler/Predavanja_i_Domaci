package Kartica;

public class TestKartica {

	public static void main(String[] args) throws Exception {
		
		Master m = new Master("Kreditna", "Lane Gutovic", 132485);
		
		m.prikaziPodatkeKartice();
		m.promeniPinKod();
		m.prikaziPodatkeKartice();

	}

}
