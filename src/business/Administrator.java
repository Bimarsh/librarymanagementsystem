package business;

public class Administrator extends Person {
	
	private Person member;

	public Administrator(String fName, String lName, int phoneNumber, String bio, String street, String city,
			String state, int zip) {
		super(fName, lName, phoneNumber, bio, street, city, state, zip);
	}
	
	public void addMember(Person person) {
		
	}

	public Person getMember() {
		return member;
	}

	public void setMember(Person member) {
		this.member = member;
	}

}
