package work2;

public class StudentManager {
	public void information(Student student) {
		System.out.println(student.getId()+". öðrencinin iletiþim bilgisi : "+student.getContactInformation());
		
	}
	public void addToCourse(Student student) {
		System.out.println(student.getId()+". öðrencinin katýlacaðý kurs : "+student.getCourse());
	}

}
