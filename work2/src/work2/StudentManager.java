package work2;

public class StudentManager {
	public void information(Student student) {
		System.out.println(student.getId()+". ��rencinin ileti�im bilgisi : "+student.getContactInformation());
		
	}
	public void addToCourse(Student student) {
		System.out.println(student.getId()+". ��rencinin kat�laca�� kurs : "+student.getCourse());
	}

}
