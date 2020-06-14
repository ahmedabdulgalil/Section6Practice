package bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount bankAcct = new BankAccount();
		
		bankAcct.setAccountNumber(1234567);
		bankAcct.setBalance(1125.50);
		bankAcct.setCustomerName("Abdulgali Ahmed");
		bankAcct.setEmail("Abdul@gmail.com");
		bankAcct.setPhoneNumber("347-285-9085");
		
		System.out.println("Account Number: " + bankAcct.getAccountNumber());
		System.out.println("Customer Name: " + bankAcct.getCustomerName());
		System.out.println("Customer Phone# " + bankAcct.getPhoneNumber());
		System.out.println("Customer Email: " + bankAcct.getEmail());
		System.out.println("Customer Balance: $" + bankAcct.getBalance());
		
		bankAcct.depoist(175.00);
		
		
		bankAcct.withdraw(1300.00);
		
		
		

	}

}
