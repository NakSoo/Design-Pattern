package practice10_01;

public abstract class Decorator extends Display {
	
	private Display display; 
	
	public Decorator(Display display) {
		this.display = display;
	}

	@Override
	public String getContent() {
		return display.getContent();
	}

}
