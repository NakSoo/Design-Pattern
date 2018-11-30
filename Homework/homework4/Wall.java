package homework4;

public class Wall implements MapSite {
	
	public Wall() {
		System.out.println("Creating Wall");
	}

	@Override
	public String getStructure() {
		return "Wall";
	}

}
