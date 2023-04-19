package Zadatak20;

public class Gen2P <T, K>{ // genericki tip sa 2 parametra

	T objt1;
	K objt2;
	
	Gen2P(T t1, K t2){
		objt1 = t1;
		objt2 = t2;
	}
	
	// Getteri za oba Tipa
	
	public T getOt1() {
		return objt1;
	}
	public K getOt2() {
		return objt2;
	}
	
	public void setOt1(T t1) {
		objt1 = t1;
	}
	public void setOt2(K t2) {
		objt2 = t2;
	}
	
	public void ispisiTip() {
		System.out.println("Prvi tip parametra je "+ objt1.getClass().getName());
		System.out.println("Drugi tip parametra je "+ objt2.getClass().getName());
	}
	
}
