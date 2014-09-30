import java.util.Date;

public class MyDate extends Person {
	
	public MyDate(String firstName, String lastName, String address, String phoneNumber,
			String emailAddress, Date dateCreated){
		super(firstName, lastName, address, phoneNumber, emailAddress);
		this.dateCreated = dateCreated;
	}
	
	private Date dateCreated = new Date();
	
	public Date getdateCreated() {
		return dateCreated;
	}
	
	
}
