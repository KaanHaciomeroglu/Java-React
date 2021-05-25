package oppIntroOdev;

public class main {

	public static void main(String[] args) {
		
		CampStudent campStudent1 = new CampStudent(1,"Kaan Hacýömeroðlu",22,"mail");
		CampStudent campStudent2 = new CampStudent(2,"Engin Demiroð",30,"mail");
		
		CampStudent[] campStudents = {campStudent1,campStudent2};
		
		for(CampStudent campStudent : campStudents) {
			System.out.println("Öðrenci: "+campStudent.name);
			System.out.println("Öðrencinin detaylarý: "+campStudent.detail);
			System.out.println("-------------------------");
		}
		
		CampStudentManager campStudentManager = new CampStudentManager();
		campStudentManager.JoinToCamp(campStudent1);
		campStudentManager.LeftToCamp(campStudent1);
		campStudentManager.JoinToCamp(campStudent2);
		campStudentManager.LeftToCamp(campStudent2);
	}

}
