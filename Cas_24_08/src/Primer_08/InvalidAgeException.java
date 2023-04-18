package Primer_08;

public class InvalidAgeException extends Throwable{
	
	private int age;
	
	InvalidAgeException(int a){
		age = a;
	}
	
	public String toString() {
		return "Age : " + age + "is not a valid age.";
	}
	// 0 - 100
	
}
