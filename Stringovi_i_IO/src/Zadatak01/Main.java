package Zadatak01;

public class Main {

	public static void main(String[] args) {

		// Stringovi se predstavljaju klasom String

		String str = "asdagfdgaw129408";
		System.out.println(str);
		// Kreiranje stringa pomocu kljucne reci new

		String str1 = new String("Utorak, 24. Januar.");
		System.out.println(str1);
		// Inicijalizacija stringa postojecim stringom

		String s1 = "Podatak1";
		String s2 = new String(s1);
		System.out.println(s1);
		System.out.println(s2);

		// Inicijalizacija nizom char vrednosti

		char s3[] = { 'a', 'b', '1', 'c', 'v' };
		System.out.println(s3);

		// Inicijalizacija podnizom

		String s4 = new String(s3, 0, 3);
		System.out.println(s4);
		System.out.println(s4.charAt(2));

		System.out.println(s1.length());

		System.out.println("sadhkshasad".length());

		// Metoda equals vrsi leksikografsko poredjenje stringova,
		// pri cemu se pravi razlika izmedju velikih i malih slova.
		// Vraca true ako su stringovi isti, u suprotnom vraca false

		// Metoda equalsIgnoreCase leksikograski poredi stringove,
		// ali ne pravi razliku izmedju malih i velikih slova.

		// Metoda copareTo poziva se kao:
		// s1.compareTo(s2)
		// vraca 0 ako su s1 i s2 jednaki, negativan broj ako je s1 manji,
		// pozitivan broj ako je s1 veci od s2.

		String s8 = "JAVA";
		String s9 = "JAVA";
		String s10 = "Java";

		System.out.println(s8 + " equals " + s9 + " = " + s8.equals(s9));
		System.out.println(s8 + " equals " + s10 + " = " + s8.equals(s10));
		System.out.println(s8 + " equalsIgnoreCase " + s9 + " = " + s8.equalsIgnoreCase(s9));

		boolean b;
		String s11 = "JAVA";
		String s12 = "JAVA";
		String s13 = "Java";
		String s14 = new String("JAVA");
		String s15 = new String("JAVA");
		System.out.println();
		System.out.println(s11 + " equals " + s12 + " = " + s11.equals(s12));
		System.out.println(s11 + " == " + s12 + " = " + (s11 == s12));
		System.out.println(s11 + " equals " + s13 + " = " + s11.equals(s13));
		System.out.println(s11 + " == " + s13 + " = " + (s11 == s13));
		System.out.println(s11 + " equals " + s14 + " = " + s11.equals(s14));
		System.out.println(s11 + " == " + s14 + " = " + (s11 == s14));
		System.out.println(s14 + " equals " + s15 + " = " + s14.equals(s15));
		System.out.println(s14 + " == " + s15 + " = " + (s14 == s15));

		System.out.println();

		String s16 = "JAVA";
		String s17 = "JAVA";
		String s18 = "Java";

		System.out.println(s16 + " compared to " + s17 + " = " + s16.compareTo(s17));
		System.out.println(s16 + " compared to " + s18 + " = " + s16.compareTo(s18));

	}

}
