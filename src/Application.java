
public class Application {
		/*
		 * Main method: create instance of ConsoleLogger. 
		 * Syntax like an array list: list<String> = ArrayList<String>();
		 * So put interface (Logger) on left and actual class name on the right (ConsoleLogger) 
		 * ^Benefit of interface, can switch class e.g. to FileLogger instead of when you normally switch out a class and have to change everything e.g. where it's used, you'd have to switch up all the code referring to it.
		 * Any implementation of Logger can be switched out 
		 */
		
		static Logger Logger;
		 
		public static void main(String[] args) {
			
//		Logger logger = new ConsoleLogger(); //can change to = new FileLogger
		Logger logger = new FileLogger(); //when change class and hit refresh in src, code is now logged to a file instead of console. Useful for if an application is running and crashes, can see what's going on and you don't have the console can look at the file and see what's happening there. 
		
		logger.info("Hello");
		logger.warning("This is a warning");
		logger.error("Oops, this is an error!");
		logger.fatal("Fatal error");
		
		logger.close();
		
		setLogger(new FileLogger()); //can pass in FileLogger or ConsoleLogger
		setLogger(new ConsoleLogger()); 
	}
	
	private static void setLogger(Logger l) { 
		Logger = l; 
	}
	
	/*
	 *Interfaces are so flexible:
	 * Anything that is a Logger (line 11) can now take the place of anything that calls for a logger (line 29).
	 * Anything that is a list (ArrayList, LinkedList, vector) can be passed into anything that takes a list (can be used when a list is required).
	 * Important rule in industry:
	 * Always code to an interface. Instead of creating a class you always create an interface first with the methods that the class will have.
	 * Then you create implementing class. So if there's any change required later on, instead of changing your class and breaking things, you just create another class that implements from the interface and use that and it can be switched in anywhere.   
	 * Familiar interfaces:
	 * Collection, map, set and list. 
	 */
}
