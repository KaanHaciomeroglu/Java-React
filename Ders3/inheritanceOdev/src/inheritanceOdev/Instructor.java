package inheritanceOdev;

public class Instructor extends User{
	
	private String LectureGiven;

	public Instructor(int id, String firstName, String lastName, String lectureGiven) {
		super(id, firstName, lastName);
		LectureGiven = lectureGiven;
	}

	public String getLectureGiven() {
		return LectureGiven;
	}

	public void setLectureGiven(String lectureGiven) {
		LectureGiven = lectureGiven;
	}
	
	
	
}
