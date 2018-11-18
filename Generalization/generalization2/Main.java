package generalization2;

public class Main {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("Naksoo");
		stack.push("Sangeun");
		stack.push("Chung");
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}
