
public class Application {

	public static void main(String[] args) {
		
		/*
		 * Main method: create instance of ConsoleLogger. 
		 * Syntax like an array list: list<String> = ArrayList<String>();
		 * So put interface (Logger) on left and actual class name on the right (ConsoleLogger) 
		 * ^Benefit of interface, can switch class e.g. to FileLogger instead of when you normally switch out a class and have to change everything e.g. where it's used, you'd have to switch up all the code referring to it.
		 * Any implementation of Logger can be switched out 
		 */
		
//		Logger logger = new ConsoleLogger(); //can change to = new FileLogger
		Logger logger = new FileLogger();
		
		logger.info("Hello");
		logger.warning("This is a warning");
		logger.error("Oops, this is an error!");
		logger.fatal("Fatal error");

	}

}
