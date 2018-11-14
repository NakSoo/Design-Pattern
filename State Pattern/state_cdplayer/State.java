package state_cdplayer;

public interface State {
	public void turn_on(CDPlayer cdPlayer);
	public void turn_off(CDPlayer cdPlayer);
	public void play(CDPlayer cdPlayer);
	public void stop(CDPlayer cdPlayer);
}
