
public class Student { //Creating Class student. Class names have Pascal casing, not camel casing. All words capitalised. 
	
	static int numberOfStudents; //static means each instance of the class will have the common property of numberOfStudents
	
	String firstName; 
	String lastName;
	String phoneNumber;
	int gradeLevel;
	
	public Student() {} //A constructor that has no parameters so can take any of them.
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName; 
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) { //special method constructor is the only method without a return type. Parameters inside ().
		this.firstName = firstName; //this. represents the specific instance of the class that's using it at that time. Also points to the variable firstName on line 6, not our parameter on line 12, so assigning parameter value to your instance value.
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel; 
		
	}
	 
	

	public void introduce( ) { //public means each instance of the class is going to have first name, last name etc. 
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
}

/*Can overload constructors and have different versions of them.
 * 
 */
