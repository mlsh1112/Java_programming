package T;

public abstract class Employee implements Payable{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee(String firstName, String lastName,String ssn)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=ssn;
	}
	
	public void setFirstName(String first) {
		firstName=first;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String last)
	{
		lastName=last;
	}
	public String getLastName() {
		return lastName;
	}
	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber=ssn;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public String toString() {
		return String.format("%s %s\nsocial security number: %s",getFirstName(),getLastName(),
				getSocialSecurityNumber());
	}


}
