package practice07_03;

public interface State {
	public abstract void on_button(Light light); 
	public abstract void off_button(Light light);
	public abstract void sleep_button(Light light);
}
