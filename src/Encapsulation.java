
public class Encapsulation {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Sally");  //Value of 1 char prints null because of the validation, has to be >1 so it never got set. 
		student.setPhoneNumber("1234567890");
//		System.out.println(student.getFirstName());
		student.introduce(); //introduce is void so doesn't return the string to be printed, can just call the method, hence this doesn't work: System.out.println(student.introduce());

		
		/*Need to encapsulate the object's data and only expose what needs to be used. Done using access modifiers.
		 * Access modifiers: 
		 * public 		accessible everywhere
		 * private		only accessible within the class itself
		 * protected 	accessible within the class, other classes in the same package, and all subclasses. 
		 * No Modifier	same as protected, except not accessible in a subclass in different packages. 
		 * 
		 * Most common: public and private fields, protected also sometimes used. 
		 */
		

	}

}
