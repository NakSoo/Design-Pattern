package association;

public class Transcript {
	private Student student;
	private Course course;
	private String grade;
	private String date;
	
	public Transcript(Student student, Course course, String date) {
		this.student = student;
		this.course = course;
		this.date = date;
		this.grade = "F";
	}
	
	public Student getStudent() {
		return this.student;
	}
	
	public Course getCourse() {
		return this.course;
	}
	
	public String getGrade() {
		return this.grade;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}

}