package customer;

public class VIPCustomer {
	
	private String name;
	private double creditLimt;
	private String customerEmail;
	
	public VIPCustomer() {
		this("Your Name", 10000, "abdu@gmail.com");
	}

	public VIPCustomer(String name, String customerEmail) {
		this(name, 2000 , customerEmail);
	}

	public VIPCustomer(String name, double creditLimt, String customerEmail) {
		
		this.name = name;
		this.creditLimt = creditLimt;
		this.customerEmail = customerEmail;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimt() {
		return creditLimt;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}
	
	
	
	
	
	

}
