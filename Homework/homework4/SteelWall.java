package homework4;

public class SteelWall extends Wall {
	
	public SteelWall() {
		System.out.println("Creating SteelWall");
	}

	@Override
	public String getStructure() {
		return "SteelWall";
	}
}
