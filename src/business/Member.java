package business;

public class Member extends Person {

	private int id;

	public Member(String fName, String lName, int phoneNumber, String bio, int id, String street, String city,
			String state, int zip) {
		super(fName, lName, phoneNumber, bio, street, city, state, zip);
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
