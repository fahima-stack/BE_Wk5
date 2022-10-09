
public class HourlyEmployee extends Employee {

//	private String firstName; 
//	private String lastName; 
//	private double pay; 
//	private String address;
//	private String reportsTo;
//	
//	public double calculatePay() { //not required now that have Employee superclass (used abstraction) 

	private double hoursWorked; //field
	
	public HourlyEmployee(String firstName, String lastName, double pay, double hoursWorked) { //constructor
		super(firstName, lastName, pay); 
		this.hoursWorked = hoursWorked; 
	}
	
	@Override //methods
	public double calculatePay() {
		return getPay() * hoursWorked;

	}
}
		

