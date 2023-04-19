package Firme;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Spec {

	public static void main(String[] args) throws Exception {

		String tablice;
		int x = 1, y = 1, x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0, x4 = 0, y4 = 0;
		String usluga, usluga1 = null, usluga2 = null, usluga3 = null, usluga4 = null;
		int suma = 0, zbir = 0;
		byte n, bu;
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		n = Byte.parseByte(bfr.readLine());

		for (int i = 1; i <= n; i++) {
			tablice = bfr.readLine();
			bu = Byte.parseByte(bfr.readLine());
			for (int k = 1; k <= bu; k++) {
				usluga = bfr.readLine();
				x = Integer.parseInt(bfr.readLine());
				y = Integer.parseInt(bfr.readLine());
				
				if (k == 1)
				{
					usluga1 = usluga;
					x1 = x;
					y1 = y;
				
				}
				else if (k == 2){
					usluga2 = usluga;
					x2 = x;
					y2 = y;
					
				}
				else if (k == 3) {
					usluga3 = usluga;
					x3 = x;
					y3 = y;
					
				}
				else if (k == 4) {
					usluga4 = usluga;
					x4 = x;
					y4 = y;
				
				}
				zbir = x1 * y1 + x2 * y2 + x3 * y3 + x4 * y4;
				System.out.println("\t" + tablice + "\t " + usluga1 + "\t " + x1 + "\t " + y1 + "\t " + usluga2 + "\t "
						+ x2 + "\t " + y2 + "\t " + usluga3 + "\t " + x3 + "\t " + y3 + "\t " + usluga4 + "\t " + x4
						+ "\t " + y4 + "\t " + zbir);
				 usluga1 = null; usluga2 = null; usluga3 = null; usluga4 = null;
				x1=0; x2=0; x3=0; x4=0; y1=0; y2=0; y3=0; y4=0;
				}
		
				suma += zbir;
			}

		}
	}
// Na dobrom sam putu samo mora malo bolje, ostavicu ovo ovako da vidim greske
