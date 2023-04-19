package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CetvrtiPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Cilj danasnjeg vezbanja posle 4tog casa je pamcenje Math. funkcija iskreno sto vise zapamtimo kroz primere
	// manje cu morati da pamtim napamet za testove
		// Ovaj primer ima dva dela a i b
		
		// a)      cos na kvadrat (x) 
		//        e                +  ln (tg(x))
		//   y = --------------------------------
		//               cosx 
		
		// y = ( Math.exp(Math.cos(x)*Math.cos(x)) + Math.log(Math.tan(x)))/Math.cos(x)
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrednost promenljive x = ");
		double x = input.nextDouble();
		double y ;
		y = (Math.exp(Math.cos(x)*Math.cos(x))+ Math.log(Math.tan(x)))/Math.cos(x);
		
		DecimalFormat df = new DecimalFormat("#.##") ;
		System.out.println("Vrednost izraza y = " + df.format(y));
		
		// b)                na 3
		//           2,52 - x
		//   z = -------------------------------------
		//               na 5    na 2,8/x na kvadrat
		// 3ci koren od x     ( e                + 2,1)
		
		double z ;
		z = (2.52 - Math.pow(x, 3))/(Math.pow(x, 5/3)*(Math.exp(2.8/(x*x))+ 2.1) );
		System.out.println("Vrednost izraza z = " + df.format(z) );
		// vraticu se na pocetak i dodacu formatiranje
		
		
		
	

	}

	

}
