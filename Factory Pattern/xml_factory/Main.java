package xml_factory;

public class Main {

	public static void main(String[] args) {
		DisplayService errorService = new ErrorXMLDisplayService();
		errorService.display();
		
		DisplayService feedbackService = new FeedbackXMLDisplayService();
		feedbackService.display();

	}

}
