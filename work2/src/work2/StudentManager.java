package work2;

public class StudentManager {
	public void information(Student student) {
		System.out.println(student.getId()+". öğrencinin iletişim bilgisi : "+student.getContactInformation());
		
	}
	public void addToCourse(Student student) {
		System.out.println(student.getId()+". öğrencinin katılacağı kurs : "+student.getCourse());
	}

}
