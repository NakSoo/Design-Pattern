package practice10_01;

public class SecureEmailContent extends Decorator {
	
	public SecureEmailContent(Display decorator) {
		super(decorator);
	}
	
	@Override
	public String getContent() {
		String content = super.getContent();
		String encryptedContent = encrypt(content);
		return encryptedContent;
	}
	
	private String encrypt(String content) {
		return content + " Encrypted";
	}
}