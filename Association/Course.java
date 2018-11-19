package association;

import java.util.Vector;

public class Course {
	public String name;
	private Vector<Transcript> transcripts;
	
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	
	public Vector<Transcript> getTranscripts() {
		return this.transcripts;
	}
	
	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}

	public String getName() {
		return this.name;
	}
	
}