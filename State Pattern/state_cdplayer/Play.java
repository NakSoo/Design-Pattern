package state_cdplayer;

public class Play implements State {

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
		System.out.println(this);

	}

	@Override
	public void stop(CDPlayer cdPlayer) {
		cdPlayer.setState(new On());
		System.out.println("CD On");
	}
	
	public String toString() {
		return "Play State";
	}

}
