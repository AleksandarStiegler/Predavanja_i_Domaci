package Zadatak19;

public class Main {

	public static void main(String[] args) {
		
		// Radicemo sa tipovima Double Char i String
		
		Gen <Double> objD = new Gen<Double>(14.77);
		
		objD.ispisTip();
		
		double vredD = objD.getOb();
		System.out.println("Posmatrana vrednost je " + vredD);
		objD.setOb(-11.89);
		System.out.println("Nova posmatrana vrednost je " + objD.getOb());
		
		Gen <String> objStr = new Gen<String>("Pera Peric");
		String str = objStr.getOb();
		
		System.out.println(str);
		
		ObrniString obr = (st) -> {
			String n = "";
			for(int i = st.length() - 1; i >= 0 ; i--) {
				n += st.charAt(i);
			}
			return n;
		};
		objStr.ispisTip();
		System.out.println("Obrnuti String Pera Peric : "+ obr.obrni(str));
		
		objStr.setOb("Aleksandar Stiegler");
		
		System.out.println("Obrnuto AleksaNdar StiegLer : " + obr.obrni(objStr.getOb()));
		
		// I ovde cu da napustim ovaj primer posto Tipa Char pravi neki problem
		// fali mi znanja mozda cu videti usput
		
	}

}
