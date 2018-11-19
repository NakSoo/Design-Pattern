package association;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Naksoo");
		Course c1 = new Course("Design Pattern");
		
		Transcript t1 = new Transcript(s1, c1, "2016");
		s1.addTranscript(t1);
		c1.addTranscript(t1);
		t1.setGrade("B+");
		
		Transcript t2 = new Transcript(s1, c1, "2017");
		s1.addTranscript(t2);
		c1.addTranscript(t2);
		t2.setGrade("A+");
		
		Course c2 = new Course("SE");
		Transcript t3 = new Transcript(s1, c2, "2017");
		s1.addTranscript(t3);
		c2.addTranscript(t3);
		t3.setGrade("B");
		
		Student s2 = new Student("Chung");
		Transcript t4 = new Transcript(s2, c1, "2017");
		s2.addTranscript(t4);
		c1.addTranscript(t4);
		t3.setGrade("C+");
		
		Vector<Course> coursese = s1.getCourses();
		for(Course c : coursese) {
			System.out.println(c.getName());
		}
		
	}

}
