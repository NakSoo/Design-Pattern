package state_cdplayer;

public class Main {

	public static void main(String[] args) {
		CDPlayer player = new CDPlayer();
		player.setState(new Off());
		
		player.turn_on();
		player.play();
		player.play();
		player.stop();
		player.stop();
		player.turn_off();
		player.turn_off();
	}

}
