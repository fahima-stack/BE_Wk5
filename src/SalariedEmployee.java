
public class SalariedEmployee extends Employee { //click SalariedEmployee + add unimplemented methods

//	private String firstName; 
//	private String lastName; 
//	private double pay; 
//	private String address;
//	private String reportsTo;
//	
//	public double calculatePay() {  //not required now that have Employee superclass 

	public SalariedEmployee(String firstName, String lastName, double pay) { //Added constructor in class that uses Superclass
		super(firstName, lastName, pay); //super.getAddress gives address of super class. 
		// TODO Auto-generated constructor stub
		 
	}

	@Override //can delete but tells you you're inheriting from superclass and adding your own implementation. 
	public double calculatePay() {
		return getPay() * 80; 
	}

	
	}

