
public abstract class Employee { //Is the superclass; method means class can't be instantiated/ implemented (abstract), it's just an abstraction of an employee 
//Going to have to implement a lot of the methods in the classes that inherit (manager, hourly and salaried employee) from this 

	
	private String firstName; 
	private String lastName; 
	private double pay; 
	private String address;
	private String reportsTo;
	
	public abstract double calculatePay(); //means it doesn't have an implementation so it doesn't have a body only time use ; right after method signature. This method HAS to be implemented by classes that inherit from Employee. 
	//calculatePay method = example of polymorphism because each class that inherits can implement in their own way. 	
	
	public String getInformation() { //method created; will return a String with info that can be printed about the employee
		return "Name: " + firstName + " " + lastName
				+ "\nReports to: " + reportsTo
				+ "\nAddress: " + address; 	
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}
	
	}