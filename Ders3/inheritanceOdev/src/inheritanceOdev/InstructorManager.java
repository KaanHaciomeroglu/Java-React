package inheritanceOdev;

public class InstructorManager {
	
	public void login(Instructor instructor) {
		System.out.println(instructor.getId()+" "+instructor.getFirstName()+" "+instructor.getLastName()+" Yay�n� Ba�latt�...");
		System.out.println("Ders Ad�: "+instructor.getLectureGiven());
	}
}
