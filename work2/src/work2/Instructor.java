package work2;

public class Instructor extends User {
	private String instructorCourse;
	
	public Instructor(int id, String firstName, String lastName, String email, String password, String instructorCourse) {
		super(id, firstName, lastName, email, password);
		this.instructorCourse = instructorCourse;
	}
	public String getInstructorCourse() {
		return instructorCourse;
	}
	public void setInstructorCourse(String instructorCourse) {
		this.instructorCourse = instructorCourse;
	}

}
