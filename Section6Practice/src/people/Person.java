package people;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	public void setFirstName (String firstName) {
		
		this.firstName = firstName;
	}
	
	public void setLastName ( String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge( int age) {
		
	 
		if (age < 0 || age > 100){
			age = 0;
		}
		this.age = age;

	}
	
	public String getFirstName (){
		return this.firstName;
		
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean isTeen () {
		if (getAge() > 12 && getAge() < 20) {
			return true;
		} else {
			return false;
		}
	}
	public String getFullName () {
		if (firstName.isEmpty() && lastName.isEmpty()) {
			String empty = new String ();
			return empty;
		}  
		if (lastName.isEmpty()){
			return firstName;	
		} 
		if (firstName.isEmpty()) {
			return lastName;
		} else 
		{
			String fullName = this.firstName +" "+ this.lastName;
			return fullName;
		}
	}
}
