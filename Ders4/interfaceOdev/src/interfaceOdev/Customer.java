package interfaceOdev;

public class Customer extends User{

	private int customerId;
	private String firstName;
	private String lastName;
	private String nationalityId;
	
	
	public Customer(int userId,int customerId, String firstName, String lastName, String nationalityId) {
		super(userId);
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getFirstName() {
		return firstName.toUpperCase();
	}

	public String getLastName() {
		return lastName.toUpperCase();
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
