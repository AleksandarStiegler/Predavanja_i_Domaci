package Petlje;

public class Zadatak09 {

	public static void main(String[] args) {

		for (int k = 1; k <= 100; k++) {
			if (k % 2 == 0) {
				System.out.println(k);
			}

		}

	}

}

	// drugi nacin 

/*  ako bi mogao da skacem za po dva kroz uslov odmah stavimo da 
 * k ide od 2 ali ne znam kako to da odradim hmmm ovo ce biti zanimljivo
 * a ako bi prvo stavio if pa onda petlju ne ne valja previse komplikovano
 * ovo ce biti zanimljivo
 * 
 *   for (int i = 2; i <= 100 ; i+=2 )eeeee ovako se menja korak 
 *  ne onako kako sam ja probao kao i + 2, e sad to onda znaci
 *  da ikrementiranje mogu da radim ne samo za +1 */
