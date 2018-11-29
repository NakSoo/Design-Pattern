package xml_factory;

public class FeedbackXMLParser implements XMLParser {

	@Override
	public String parser() {
		System.out.println("Parsing Feedback Message");
		return "Feedback XML Message";
	}

}
