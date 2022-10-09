
public class Student { //Creating Class student. Class names have Pascal casing, not camel casing. All words capitalised. 
	
	static int numberOfStudents; //static means each instance of the class will have the common property of numberOfStudents
	
	private String firstName; 
	private String lastName;
	private String phoneNumber;
	private int gradeLevel; 		//made all fields private so not accessible 
	
	public Student() {} //A constructor that has no parameters so can take any of them.
	
	/*
	 * Constructors 
	 */
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName; 
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) { //special method constructor is the only method without a return type. Parameters inside ().
		this.firstName = firstName; //this. represents the specific instance of the class that's using it at that time. Also points to the variable firstName on line 6, not our parameter on line 12, so assigning parameter value to your instance value (passing the value).
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel; 
		
	}
	 
	/*
	 * Public methods
	 */

	public void introduce( ) { //public means each instance of the class is going to have first name, last name etc. 
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	
	/*
	 * Private methods - not accessible outside this class
	 */
	private boolean checkLength(String str, int length) { 
		return str.length() > length;
	}
	
	/*
	 * Getters and Setters (or accessor's and mutators) are methods for accessing and mutating data
	 * void means not going to return anything.
	 * Still have access to the first name field on encapsulation class so how did these getters and setters make it better? Can still access and mutate the data. 
	 * Purpose is can add logic inside Getters and Setters if need to e.g. validating data that's passed into them. 
	 * For example, area of a rectangle: set this.width =  width (can access and mutate) 
	 * this.area = width*length wouldn't have a getter and setter for this because don;t want to be accessed or mutated. 
	 */
	
	public void setFirstName(String firstName) {//parameter data type has to be string, has to match the variable you're sending value to 
//		if (firstName.length() > 1) { //just created a private method checkLength for repeat code 
		if (checkLength(firstName, 1)) {
		this.firstName = firstName; 
		}
	}
	
	public String getFirstName() {
		return firstName; //Don't have to use this. keyword as don't have a parameter value. 
	}
	
	public void setLastName(String lastName) { 
//		this.lastName = lastName;
		if (checkLength(lastName, 1)) { 
			this.lastName  = lastName; 
		}
	}
	
	public String getLastNme( ) { 
		return lastName;
	}
	
	public void setPhoneNumber (String phoneNumber) {
		if (checkLength(phoneNumber, 9)) {
		this.phoneNumber = phoneNumber;
		}
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setGradeLevel(int gradeLevel) {
		if (gradeLevel > 0 && gradeLevel < 13) {
		this.gradeLevel = gradeLevel;
		}
	}
	
	public int getGradeLevel() { 
		return gradeLevel;
	}
}


/*Can overload constructors and have different versions of them.
 * 
 */
