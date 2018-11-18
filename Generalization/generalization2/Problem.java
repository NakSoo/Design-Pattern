package generalization2;

abstract class Animal {
	public abstract void printName();
}

class Cat extends Animal {
	public void printName() {
		System.out.println("�����");
	}
}

class Dog extends Animal {
	public void printName() {
		System.out.println("��");
	}
}


class Snake extends Animal {
	public void printName() {
		System.out.println("��");
	}
}


class Lion extends Animal {
	public void printName() {
		System.out.println("����");
	}
	
	public void ride() {
		System.out.println("���� Ÿ���Ҵ�? Ÿ���� �ʾ����� ���� ���� ��!");
	}
}

public class Problem {
	public static void main(String [] args) {
		Animal[] animals = {new Cat(), new Dog(), new Lion(), new Snake() };
		((Cat)animals[0]).printName();
		((Cat)animals[1]).printName();
		((Snake)animals[2]).printName();
		((Lion)animals[2]).ride();
		animals[3].printName();
	}
}
