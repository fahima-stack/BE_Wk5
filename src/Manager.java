
public class Manager extends Employee { //click Manager + add unimplemented methods

//	private String firstName; 
//	private String lastName; 
//	private double pay; 
//	private String address;
//	private String reportsTo;

//	public double calculatePay() { //not required now that have Employee superclass 
	
	private double bonusPercentage; //extra field added to manager
	
	public Manager(String firstName, String lastName, double pay, double bonusPercentage) { //has additional parameter of bonusPercentage
		super(firstName, lastName, pay);
		this.bonusPercentage = bonusPercentage; 
	}
	
	@Override
	public double calculatePay() {
		return getPay() * 80 * bonusPercentage;
	}
	

	
	}
	



