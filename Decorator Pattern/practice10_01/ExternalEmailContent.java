package practice10_01;

public class ExternalEmailContent extends Decorator {

	public ExternalEmailContent(Display decorator) {
		super(decorator);
	}
	
	@Override
	public String getContent() {
		String content = super.getContent();
		String externalContent = addDisclaimer(content);
		return externalContent;
	}
	
	private String addDisclaimer(String content) {
		return content + " Company Disclaimer";
	}
	
}
