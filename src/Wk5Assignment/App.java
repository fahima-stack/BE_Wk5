package Wk5Assignment;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		String y = "Hello";
		logger.Log(y);
		logger.Error(y);
		
		logger2.Log(y);
		logger2.Error(y);
	}
}
