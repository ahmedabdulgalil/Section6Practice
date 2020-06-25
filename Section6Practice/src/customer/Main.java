package customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VIPCustomer abdul = new VIPCustomer();
		System.out.println("Name: "+abdul.getName());
		System.out.println("Customer email: "+ abdul.getCustomerEmail());
		System.out.println("Credit Limit is $"+ abdul.getCreditLimt());
		
		VIPCustomer Karim = new VIPCustomer("Karim", "karim@yahoo.com");
		System.out.println("Name: "+ Karim.getName());
		System.out.println("Customer email: "+ Karim.getCustomerEmail());
		System.out.println("Credit Limit is $"+ Karim.getCreditLimt());

		VIPCustomer Moe = new VIPCustomer("Moe", 50, "moe@yemen.com");
		System.out.println("Name: "+Moe.getName());
		System.out.println("Customer email: "+ Moe.getCustomerEmail());
		System.out.println("Credit Limit is $"+ Moe.getCreditLimt());
	}

}
