package practice10_01;

public class Client {

	public static void main(String[] args) {
		BasicEmailContent simple = new BasicEmailContent("Hello");
		System.out.println(simple.getContent());
		
		Display external = new ExternalEmailContent(new BasicEmailContent("Hello"));
		System.out.println(external.getContent());
		
		Display secure = new SecureEmailContent(new BasicEmailContent("Hello"));
		System.out.println(secure.getContent());
		
		Display secureExternal = new SecureEmailContent(new ExternalEmailContent(new BasicEmailContent("Hello")));
		System.out.println(secureExternal.getContent());
	}

}
