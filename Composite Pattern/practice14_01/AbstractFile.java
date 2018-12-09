package practice14_01;

public abstract class AbstractFile {
	private String name;
	private int depth;
	
	public AbstractFile(String name) {
		this.name = name;
		depth = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public abstract int getSize();
	public abstract void print();
}
