package inheritanceOdev;

public class Student extends User {

	private String studentNumber;
	private String firstName;
	private String lastName;

	public Student(int id, String firstName, String lastName, String studentNumber) {
		super(id);
		this.studentNumber = studentNumber;
		this.firstName  = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
