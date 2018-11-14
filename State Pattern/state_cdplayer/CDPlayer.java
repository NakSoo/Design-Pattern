package state_cdplayer;

public class CDPlayer {
	private State state;
	
	public void turn_on() {
		state.turn_on(this);
	}
	
	public void turn_off() {
		state.turn_off(this);
	}
	
	public void play() {
		state.play(this);
	}
	
	public void stop() {
		state.stop(this);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
}
