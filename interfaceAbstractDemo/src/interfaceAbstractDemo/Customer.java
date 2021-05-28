package interfaceAbstractDemo;

public class Customer implements IEntity {
	public int id;
	public String firstName;
	public String lastName;
	public int dateTime;
	public String NationalityId;

	public Customer(int id, String firstName, String lastName, int dateTime, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateTime = dateTime;
		NationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getDateTime() {
		return dateTime;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateTime(int dateTime) {
		this.dateTime = dateTime;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}
