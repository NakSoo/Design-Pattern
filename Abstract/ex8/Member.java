package ex8;

public class Member {
	private Level level;

	public Level getLevel() {
		return this.level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	public Member() {
		this.level = new Ordinary();
	}
}
