package inheritanceOdev;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(61,"Kaan","Hacıömeroğlu","180");
		Instructor instructor= new Instructor(06, "Engin", "Demiroğ", "Java/React");
		
		UserManager userManager = new UserManager();
		userManager.instructor(instructor);
		
		UserManager userManager1 = new UserManager();
		userManager1.student(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);

		
		
		
		
	}

}
