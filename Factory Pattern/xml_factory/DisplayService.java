package xml_factory;

public abstract class DisplayService {
	public void display() {
		XMLParser xmlParser = getParser();
		String msg = xmlParser.parser();
		System.out.println(msg);
	}
	
	protected abstract XMLParser getParser();
}
