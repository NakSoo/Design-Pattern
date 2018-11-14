package state_cdplayer;

public class Off implements State {

	@Override
	public void turn_on(CDPlayer cdPlayer) {
		cdPlayer.setState(new On());
		System.out.println("CD On");
	}

	@Override
	public void turn_off(CDPlayer cdPlayer) {
		System.out.println(this);

	}

	@Override
	public void play(CDPlayer cdPlayer) {
		System.out.println(this);

	}

	@Override
	public void stop(CDPlayer cdPlayer) {
		System.out.println(this);

	}
	
	public String toString() {
		return "Off State";
	}

}
