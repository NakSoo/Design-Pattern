package practice10_01;

public class BasicEmailContent extends Display {
	private String content;
	
	public BasicEmailContent(String content) {
		this.content = content;
	}
	
	@Override
	public String getContent() {
		return content;
	}
}
