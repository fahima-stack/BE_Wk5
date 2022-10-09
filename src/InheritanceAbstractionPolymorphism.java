
public class InheritanceAbstractionPolymorphism {

	public static void main(String[] args) {

		Employee salary = new SalariedEmployee("Tom", "Sawyer", 2500.00); //Of type Employee but instance is a salaried employee. 
		Employee hourly = new HourlyEmployee("Tim", "Smith", 15.00, 75.5);
		Employee manager = new Manager("Rob", "Lincoln", 4500.00, 15.5);
	
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
		
		/*Summary: used abstraction by taking out all the common pieces and moving them up to a higher level.
		 *Used inheritance to inherit from our superclass the properties that exist there so all these are inherited by the subclasses.
		 *Used polymorphism by making the calculate pay method act differently on each of our classes. 
		 *Cleaner code, reused and easier to maintain and manage = purpose of OOP. 
		 */
	}
	
 }
