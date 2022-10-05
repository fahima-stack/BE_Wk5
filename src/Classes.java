
public class Classes {

	public static void main(String[] args) {
	
		StringBuilder name = new StringBuilder(); //line 6, 7 + 9 are methods because ()
		StringBuilder name2 = new StringBuilder();  
		
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "2480-123-4567"; //prints Hello, my name is Tom Smith/ I am in grade 12/My phone number is 2480-123-4567

		student1.introduce();
		
		Student student2 = new Student ("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tom", "Riddle", "904-320-9876", 11);
		student3.introduce();
	}

}

/*Classes that come with Java:
 * -E.g. String; StringBuilder, Scanner, Array, ArrayList
 * -Have used and created instances of these classes using 'new' keyword (created an object which is an instance of the class). 
 *      .See line 06/07: you have created Objects called name and name2 that are instances of the Class StringBuilder (data type). 
 * -Using . notation to assign values to our instance of the student class is cumbersome - repeating 5 lines of code for each instance of the student class.
 * -^ solve using Constructor (line 6 + 7 are Constructors, java gives to classes that don't have.
 * Constructor is a special method, it's the method you call when you create an instance of it.     
 */