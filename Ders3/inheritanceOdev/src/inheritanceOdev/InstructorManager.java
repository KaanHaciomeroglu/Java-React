package inheritanceOdev;

public class InstructorManager {
	
	public void login(Instructor instructor) {
		System.out.println(instructor.getId()+" "+instructor.getFirstName()+" "+instructor.getLastName()+" Yayýný Baþlattý...");
		System.out.println("Ders Adý: "+instructor.getLectureGiven());
	}
}
