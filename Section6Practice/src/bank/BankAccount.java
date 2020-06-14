package bank;

public class BankAccount {
	
	
	private int accountNumber;
	private double  balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	
	
	public void setAccountNumber (int accountNumber) {
		this.accountNumber = accountNumber;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setBalance (double balance) {
		this.balance = balance;
		
	}
	
	public double getBalance ()	{
		return balance;
	}
	
	public void setCustomerName (String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName () {
		return customerName;
	} 
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
			
	}
	
	public void setPhoneNumber ( String phoneNumber) {
		this.phoneNumber = phoneNumber;
		
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void depoist (double deposit) {
		
		this.balance += deposit;
		System.out.println("Money depoisted $" + deposit);
		System.out.println("your New balance is $" + this.balance);
	}
	
	public void withdraw ( double withdraw) {
		
		if ( this.balance - withdraw > 0) {
			
			this.balance -= withdraw;
			System.out.println("Amount withdrawed is $"+ withdraw);
			System.out.println("you new Balance is $" + this.balance );
		
		} else {
			System.out.println("insufficient fund");
			System.out.print("you requested $" + withdraw + " to withdraw and your balance is $" + this.balance);
		}

	}
}
