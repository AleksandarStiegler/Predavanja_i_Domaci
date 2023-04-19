package Izuzetak;

public class Motor {

	public String motor;
	public double kubikaza;
	
	public String getMotor() {
		return motor;
	}
	public void setMotor(String m) throws Exception{
		
		if(m.isBlank() || m.isEmpty()) {
			throw new Izuzetak("Motor mora imati naziv , polje ne moze biti null ili prazno");
		}
		else {
		this.motor = m;}
	}
	public double getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(double k) throws Exception{
		if (k >= 50 && k <= 2000) {
			this.kubikaza = k;
		}
		else {
			throw new Izuzetak("Kubikaza mora biti u opsegu od 50 do 2000.");
			
		}
	}
	public String opis() {
		return "Motor : " + motor+"\nKubikaza : "+kubikaza;
	}
	
}
