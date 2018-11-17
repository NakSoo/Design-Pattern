package singleton;

public class Something {
	
	private Something() {}
	private static class LazyHolder {
		public static final Something INSTANCE = new Something(); 
	}
	
	public static Something getInstance() {
		return LazyHolder.INSTANCE;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}

}
