package inheritanceOdev;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(61, "Kaan", "Hac��mero�lu", "180");
		Instructor instructor= new Instructor(06, "Engin", "Demiro�", "Java/React");
		
		UserManager userManager = new UserManager();
		userManager.user(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);

		
		
		
		
	}

}
