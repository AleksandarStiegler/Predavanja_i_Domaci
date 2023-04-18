package Zadatak_04;

public class OkreniZnak {

	public static void main(String[] args) {

		OkreniString os = (str) -> {
			String rezultat = "";

			for (int i = str.length() - 1; i >= 0; i--) {
				rezultat += str.charAt(i);

			}
			return rezultat;
		};
		
		System.out.println("12345 "+os.Okreni("12345"));
		System.out.println("Milan Kitanovic "+os.Okreni("Milan Kitanovic"));
	}
}
