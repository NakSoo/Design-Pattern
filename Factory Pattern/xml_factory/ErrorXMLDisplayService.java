package xml_factory;

public class ErrorXMLDisplayService extends DisplayService {

	@Override
	protected XMLParser getParser() {
		return new ErrorXMLParser();
	}

}
