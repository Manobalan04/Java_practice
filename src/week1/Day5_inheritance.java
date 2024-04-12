package week1;

class Parent {
	int a = 7;

	void display() {
		System.out.println("normal parent class");
	}

	Parent() {
		System.out.println("constructor without parameter in parent (super class)");
	}

	Parent(int a) {
		System.out.println("constructor with parameter in parent (super class)");
	}

}

public class Day5_inheritance extends Parent {
	int a = 5;

	void display() {
		super.display();

		System.out.println("normal child class");
		System.out.println("int sub class-> " + a);
		System.out.println("int super class-> " + super.a);
	}

	Day5_inheritance() {
		System.out.println("constructor without parameter in child (sub class)");
	}

	Day5_inheritance(int a) {
		super(5);
		System.out.println("constructor with parameter in child (sub class)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inheritance:-");
		System.out.println("");

		Day5_inheritance d = new Day5_inheritance(5);
		d.display();
		Day5_inheritance d1 = new Day5_inheritance();

	}

}