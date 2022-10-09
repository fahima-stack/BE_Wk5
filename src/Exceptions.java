import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
	
	/*Errors are shown in red lines, once they're gone, code is safe to run, no compilation errors. 
	 *Exceptions: The things that can go wrong when a program compiles successfully and is able to run.
	 */
	public static void main(String[] args) {
	
		int[] numbers = new int[3];
		System.out.println("Hi");
		
		if (numbers.length > 3) { //conditional to make sure only access element 3 if it exists 
			System.out.println(numbers[3]); //Exception: printing out of bounds elements 4 in 3-element Array as 0-base indexing.
		}
		
		System.out.println("Bye");
		
		/*
		 * Exceptions cause program to crash if it isn't handled (code after the crash doesn't run).
		 * 2 types of Exceptions: Checked + Unchecked
		 * 
		 * Checked: Explicitly check for in our code. We don't have control over this exception e.g. if we're reading form a database and the database shuts down/ lose connection. If trying to read it it's going to throw an exception. 
		 * But can check for them + handle them if + when they occur. 
		 * try catch block -  handles checked exceptions
		 *    -> Wrap any code that could throw an exception in a try/catch block e.g. reading from a file or database
		 * 
		 * 
		 * Unchecked: Something we have control over;you avoid these exceptions by writing clean code and following best practices. Have complete control over these.
		 * 2 main examples: index out of bounds like above and a null pointer. 
		 * Can be mitigated by coding properly and putting safe checks to make sure e.g.: 
		 * Don't call an index or array that's out of bounds
		 * Ensure a variable has a value assigned to it before trying to access a property or method on it and getting a null pointer.  
		 * 
		 */
		
		try {
			FileReader fileReader = new FileReader("something.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (Exception e) { //Exception is like the superclass of all exceptions (e = name of variable).
		
		} finally { 
			System.out.println("Finally!");
		//just like if if else statements, can catch multiple exceptions but must start from lowest subclass (most specific) up top to most general class. 
		//finally sometimes used and will always run; so if the try block succeeds and there's no exception or if the try block throws an exception and the catch is ran.  
		}
		
		System.out.println("after the try catch");
		
		try {
			openFile("AnotherFile.jpg");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			//Or can do
			System.out.println(e.toString());	
		}
		
		}
	
		public static FileReader openFile(String fileName) throws FileNotFoundException {
			return new FileReader(fileName);   //if have method that could throw exception, you can add throws keyword and name the exception and just handle it somewhere else with try catch (line 52)
	
				
		//Array out of bounds is unchecked so should never try checking or catching. Only for checked exceptions where it's out of our control.
		}
	}

