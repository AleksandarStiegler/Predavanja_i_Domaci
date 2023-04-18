package Uredjaj;

public class KlimaUredjaj extends Uredjaj {

	int temperatura = 18;

	KlimaUredjaj(String klimUredj, boolean uklj, int temp) {
		super(klimUredj, uklj);

		if (temp >= 18 || temp <= 30) {
			this.temperatura = temp;
		} else {
			System.out.println("Greska : Temperatura mora biti u opsegu od 18 do 30 stepeni");
		}

	}

	public void povecajTemperaturu() {
		if (temperatura < 30) {
			temperatura++;
		} else {
			temperatura = 18;
		}
	}

	public void smanjiTemperaturu() {
		if (temperatura > 18) {
			temperatura--;
		} else {
			temperatura = 30;
		}
	}

	public int getTemperatura() {
		return temperatura;
	}

	public String ispisiKlimaUredjaj() {
		return ispisi() + " Trenutna temperatura : " + getTemperatura();
	}

}
