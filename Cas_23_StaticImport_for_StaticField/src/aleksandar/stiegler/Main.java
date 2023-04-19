package aleksandar.stiegler;

import java.util.Scanner;
import static java.lang.Math.PI;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double r, a;
		System.out.println("Unesite poluprecnik");
		r = sc.nextDouble();
		a = PI * r * r;
		
		System.out.println("Povrsina kruga "+a);
		

	}

}
