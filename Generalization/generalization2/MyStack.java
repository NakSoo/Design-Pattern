package generalization2;
import java.util.ArrayList;

public class MyStack {
	
	private ArrayList<String> arrayList = new ArrayList<String>();
	
	public void push(String element) {
		arrayList.add(element);
	}
	
	public String pop() {
		return arrayList.remove(arrayList.size()-1);
	}
	
	public boolean isEmpty() {
		return arrayList.isEmpty();
	}

}
