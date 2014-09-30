public class Person {
	//data fields
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String emailAddress;
	
	//public no-arg construtor
	public Person(){
	}
	
	//public arg constructor for data fields
	public Person(String firstName, String lastName, String address, 
				  String phoneNumber, String emailAddress){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	
	//getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

		
	//setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String toString(){
		return "Name is " + firstName + " in the Person class.";
	}

}
