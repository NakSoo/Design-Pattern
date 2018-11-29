package xml_factory;

public class FeedbackXMLDisplayService extends DisplayService {

	@Override
	protected XMLParser getParser() {
		return new FeedbackXMLParser();
	}

}
