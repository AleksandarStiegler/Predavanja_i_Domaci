package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak13a {

	public static void main(String[] args) throws Exception {

		// Isti zadatak samo da ga uradimo na malo drugaciji nacin tako da ajde da ne
		// kucamo sve ispocetka

		// Unos podataka

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int k1, k2, k3;

		System.out.print("Unesite redni broj prvog dana .  ");
		k1 = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite redni broj drugog dana .  ");
		k2 = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite redni broj treceg dana .  ");
		k3 = Integer.parseInt(bfr.readLine());

		// Resavanje problema
		
		// Da iskoristimo i malo formatiranje fore radi
		System.out.printf("%10s%10s%10s \n","Prvi dan", "Drugi dan", "Treci dan");
		System.out.printf("%8d%8d%8d \n", k1 , k2 , k3 );

		if (k1 % 7 == 1 && k2 % 7 == 1 && k3 % 7 == 1) {
			System.out.println("Uneti dani su isti dan u nedelji");
		} else if (k1 % 7 == 2 && k2 % 7 == 2 && k3 % 7 == 2) {
			System.out.println("Uneti dani su isti dan u nedelji");
		} else if (k1 % 7 == 3 && k2 % 7 == 3 && k3 % 7 == 3) {
			System.out.println("Uneti dani su isti dan u nedelji");
		} else if (k1 % 7 == 4 && k2 % 7 == 4 && k3 % 7 == 4) {
			System.out.println("Uneti dani su isti dan u nedelji");
		} else if (k1 % 7 == 5 && k2 % 7 == 5 && k3 % 7 == 5) {
			System.out.println("Uneti dani su isti dan u nedelji");
		} else if (k1 % 7 == 6 && k2 % 7 == 6 && k3 % 7 == 6) {
			System.out.println("Uneti dani su isti dan u nedelji");
		} else if (k1 % 7 == 0 && k2 % 7 == 0 && k3 % 7 == 0) {
			System.out.println("Uneti dani su isti dan u nedelji");
		} else {
			System.out.println("Uneti dani nisu isti dan u nedelji");
		}
	}

}
	// Ovo je bilo moje prvobitno resenje posto nisam mogao da se setim kako bih postavio proporciju kako treaba
	// kolega Matic je uradio ono sto sam ja zeleo i ono je daleko elegantnije resenje od ovog
	// doduse ovo resenje radi i malo vise ispitivanja koja kasnije mogu da se iskoriste , po nekom mom razmisljanju
	// trebalo bi da mozemo da iskoristimo za odredjivanje dana u nedelji za sve godine uz malu modifikaciju
	// Posto se zapravo kalendar ponavlja svakih 400 godina samo treba da resimo taj deo oko brojaca i mozemo da odradimo
	// ostatak pri deljenju se nece menjati, i ako krenemo sa 1 = ponedeljak prvu godinu mozemo normalno da resimo
	// problem nastaje pri prelazu na sledecu godinu ako brojac vratimo na nulu tj. 1 treba videti na kom se danu 
	// prethodna godina zavrsila i onda sledecoj godini i prvom danu dodeliti taj dan kao nultu vrednost tj. npr ostatak pri 
	// deljenju == 1 sada bi recimo bila sreda i onda da nastavi 2 == cetvrtak itd. Ovo je malo komplikovanjije pa 
	// mi treba jos malo znanja da resim ovo, za sada meni je u glavi da pustim brojac da nastavi posle 365 ili 366 i da 
	// dodeljuje dane po redosledu ali ovo je zakrpa nisam ni siguran kako bi odradio to s tim da bih uveo jos jedan brojac
	// koji bi brojao nove dane i koji bi se vracao na 1 svake godine. Mislim da mi je razmisljanje na pravom putu i da je 
	// ovako vrlo moguce resiti kalendar. Posto sam vec rekao da se on ponavlja svakih 400 godina moracu da probam jedan dan
	// bice zanimljivo.

