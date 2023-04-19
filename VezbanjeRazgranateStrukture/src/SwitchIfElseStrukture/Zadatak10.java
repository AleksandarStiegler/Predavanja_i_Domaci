package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak10 {

	public static void main(String[] args) throws Exception {

		// Napisati program kojim se ispisuju moguce vrednosti koordinata x i y zavisno
		// od broja kvadranta koji se unosi
		// E sad kad smo ovo uradili na predavanjima umesto vrednosti po x i y unosili
		// smo ugao

		// Unos podataka

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		int x;
		System.out.print("Unesite kvadrant 1 - 4 :");
		x = Integer.parseInt(bfr.readLine());
		// System.out.print("Unesite koordinatu y : ");
		// y = Double.parseDouble(bfr.readLine()); pogresno sam krenuo ali necu da
		// brisem nek ostane kao podsetnik

		switch (x) {
		case 1: {
			System.out.print("Vrednosti koordinata x i y mogu da se krecu u opsegu od 0 do +∞, a ugao je od 0 do 90 ");
			break;
		}
		case 2: {
			System.out.print("Vrednost koordinata x moze biti od -∞ do 0,  y od 0 do +∞ , a ugao je od 90 do 180 ");
			break;
		}
		case 3: {
			System.out.print("Vrednost koordinata x i y moze biti od -∞ do 0,  ugao ide od 180 do 270 ");
			break;
		}
		case 4: {
			System.out.print("Vrednost koordinata x moze biti od 0 do +∞ ,  y od -∞ do 0 , a ugao od 270 do 360 ");
			break;
		}

		default:
	
		System.out.println("Pogresan unos");
		}
		
	}

}
