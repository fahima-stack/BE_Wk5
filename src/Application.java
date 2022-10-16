
public class Application {

	public static void main(String[] args) {
		
		/*
		 * Main method: create instance of ConsoleLogger. 
		 * Syntax like an array list: list<String> = ArrayList<String>();
		 * So put interface (Logger) on left and actual class name on the right (ConsoleLogger) 
		 * 
		 */
		
		Logger logger = new ConsoleLogger();
		
		logger.info("Hello");
		logger.warning("This is a warning");
		logger.error("Oops, this is an error!");
		logger.fatal("Fatal error");

	}

}
