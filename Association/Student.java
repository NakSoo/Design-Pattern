package association;

import java.util.Vector;

public class Student {
	public String name;
	private Vector<Transcript> transcripts;
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public Vector<Transcript> getTranscripts() {
		return this.transcripts;
	}
	
	public Student(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}

	public String getName() {
		return this.name;
	}
	
	public Vector<Course> getCourses() {
		Vector<Course> courses = new Vector<Course>();
		
		for(Transcript t : transcripts) {
			courses.add(t.getCourse());
		}
		
		return courses;
	}
	
	
	
	
}
