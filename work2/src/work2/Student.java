package work2;

public class Student extends User {
	String contactInformation;
	String course;
	
	public Student(int id, String firstName, String lastName, String email, String password, String contactInformation, String course) {
		super(id, firstName, lastName, email, password);
		this.contactInformation = contactInformation;
		this.course = course;
	}
	public String getContactInformation() {
		return contactInformation;
	}
	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
