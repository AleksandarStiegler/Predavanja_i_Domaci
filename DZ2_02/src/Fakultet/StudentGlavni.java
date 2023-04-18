package Fakultet;

//import java.util.ArrayList;

public class StudentGlavni {

	public static void main(String[] args) {
		
	//	ArrayList<Student> st = new ArrayList<Student>();
		
		// Sto se tice duplikata studenata ne znam kako bih resio to ovde kad smo
		// mi napisali sve ali ako bi isao preko konzole napravio bih ispitivanje
		// po indeksu posto su oni jedinstveni a ime i prezime u nekim slucajevima
		// moze i da bude identicno. Nesto ovako:
		/*
		 * int temp = indeks; koji bi bio unet sa konzole
		 * int n = 0;
		 * for (Student s : st){
		 * 		if ( temp == s.vratiIndeks()){
		 * 				n++;
		 * 			System.out.println("Student nije dodat. Vec se nalazio u sistemu.");
		 * 			break;
		 * 		}else{
		 * 			Student aleks = new Student("Aleks Stig", 20230904, 50);
		 * 			st.add(aleks);
		 * }} 
		 * nesto ovako i verovatno bi trebalo da ide u try catch block ali ideja ostaje ista
		 */
	
		
		Student aleks = new Student("Aleks Stig", 20230904, 50);
		
		
		
		aleks.dodajIspit(new Ispit("Matem1", 7));
		aleks.dodajIspit(new Ispit("Matem2", 8));
		aleks.dodajIspit(new Ispit("Matem3", 6));
		
	    aleks.studentProsek();
		
	   
	}

}
