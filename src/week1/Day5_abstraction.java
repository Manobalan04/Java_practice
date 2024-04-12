package week1;

abstract class abst {

	abstract void process();

	static void fun() {
		System.out.println("hi");
	}
}

class dup1 extends abst {
	void process() {
		System.out.println("abstract method in class1");
	}
}

class dup2 extends abst {
	void process() {
		System.out.println("abstract method in class2");
	}
}

public class Day5_abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Abstract:-");
		System.out.println("");

		dup1 d1 = new dup1();
		d1.process();

		dup2 d2 = new dup2();
		d2.process();

	}

}