package inheritanceOdev;

public class Instructor extends User {

	private String LectureGiven;
	private String firstName;
	private String lastName;

	public Instructor(int id, String firstName, String lastName, String lectureGiven) {
		super(id);
		LectureGiven = lectureGiven;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getLectureGiven() {
		return LectureGiven;
	}

	public void setLectureGiven(String lectureGiven) {
		LectureGiven = lectureGiven;
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

}
