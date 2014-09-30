public class Student extends Person {
	
	private String classStatus;
	
	//constructor for Student uses 'super' to call constructor for Person class
	public Student(String firstName, String lastName, String address, 
			String phoneNumber, String emailAddress, String classStatus){
		super(firstName, lastName, address, phoneNumber, emailAddress);
		this.classStatus = classStatus;	
	}
	
	public String getClassStatus(){
		return this.classStatus;
	}
	
	public void setClassStatus(String classStatus){
		this.classStatus = classStatus;
	}
	
	
	@Override 
	public String toString(){
		return "User is " + super.getFirstName() + " in the Student class";
		
	}
}
