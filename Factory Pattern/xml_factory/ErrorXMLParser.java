package xml_factory;

public class ErrorXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("Parsing Error Message");
		return "Error XML Message";
	}

}
