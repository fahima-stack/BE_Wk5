
public class Student { //Creating Class student. Class names have Pascal casing, not camel casing. All words capitalised. 
	
	String firstName; 
	String lastName;
	String phoneNumber;
	int gradeLevel;
	
	public void introduce( ) { //each instance of the class is going to have first name, last name etc. 
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
}
