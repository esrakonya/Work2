package work2;

public class Main {

	public static void main(String[] args) {
		
		Student user1 = new Student(1, "Esra", "Konya", "esra@example.com", "12345", "05********", "Java");
		
		Student user2 = new Student(2, "kdfjkld", "kjlşlkj", "ghjk@example.com", "7896", "05*********", "C#");
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "engin@example.com", "111111", "Java");
		
		Student[] users = { user1, user2 };
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addToCourse(user1);
		studentManager.addToCourse(user2);
		studentManager.information(user1);
		studentManager.information(user2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addToDetail(instructor1);
		
		
		
		

		

	}

}
