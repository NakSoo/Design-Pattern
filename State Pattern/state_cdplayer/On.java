package state_cdplayer;

public class On implements State {

	@Override
	public void turn_on(CDPlayer cdPlayer) {
		System.out.println(this);

	}

	@Override
	public void turn_off(CDPlayer cdPlayer) {
		cdPlayer.setState(new Off());
		System.out.println("CD Off");
	}

	@Override
	public void play(CDPlayer cdPlayer) {
		cdPlayer.setState(new Play());
		System.out.println("CD Play");
	}

	@Override
	public void stop(CDPlayer cdPlayer) {
		System.out.println(this);
	}
	
	public String toString() {
		return "On State";
	}

}
