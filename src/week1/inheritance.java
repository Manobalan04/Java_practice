package week1;

class A {
	int a = 1;

	A() {
		System.out.println("const A1");
	}

	A(int a) {
		System.out.println("const A");
	}

//	void display() {
//		System.out.println("class A");
//	}
}

public class inheritance extends A {

	private static int a;

	inheritance(int a) {
		super(a);
		System.out.println("const B");
	}

	inheritance() {
		System.out.println("const B1");
	}

//	void display() {
//		super.display();
//		System.out.println("class B");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inheritance i = new inheritance(5);
//		i.display();
		inheritance j = new inheritance();

	}

}