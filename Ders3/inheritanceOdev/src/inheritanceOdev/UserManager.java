package inheritanceOdev;

public class UserManager{
	
	
	public void student(Student student) {
		System.out.println("Ogrenci : "+student.getId()+" "+student.getFirstName()+" "+student.getLastName()+" "+student.getStudentNumber()+" sisteme dahil edildi...");
	}
	
	public void instructor(Instructor instructor) {
		System.out.println("Ogretmen : "+instructor.getId()+" "+instructor.getFirstName()+" "+instructor.getLastName()+" "+instructor.getLectureGiven()+" sisteme dahil edildi...");
	}
}
