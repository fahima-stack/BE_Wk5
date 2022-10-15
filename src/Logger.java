
/*
 * Class can implement multiple interfaces unlike inheritance where you can only inherit one class 
 * Difference between abstract class and interface:
 * -Interface doesn't define any method implementations (has abstract methods only):
 *      You define the methods (what want it to have) but not the bodies (what they actually do). 
 * -Abstract class has some abstract methods and some methods that have bodies with implementations defined.
 * -Interface you only define the method signature. Use when you know what the class implementing the interface will do but don't know how you want it to happen. You leave the implementation 100% up to that class.  
 * -Interface is a contract; when a class implements an interface it has to create a concrete implementation of each of the methods defined in the interface. 
 */

public interface Logger {

	public void info(String info); 
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	
}
