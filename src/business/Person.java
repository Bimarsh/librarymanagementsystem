package business;

public abstract class Person {

	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String username;
	private String password;
	private String bio;
	private Address address;
	private Role role;

	public Person(String fName, String lName, int phoneNumber, String bio, String street, String city, String state,
			int zip) {
		firstName = fName;
		lastName = lName;
		this.phoneNumber = phoneNumber;
		this.bio = bio;
		address = new Address(street, city, state, zip);
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getBio() {
		return bio;
	}

}
