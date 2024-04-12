package week2;

interface inter1 {

	abstract void display1();

	void display2();
}

interface inter2 {

	abstract void display11();

	void display22();
}

public class Day6_interface implements inter1, inter2 {

	public void display1() {
		System.out.println("class1 abstract method");
	}

	public void display2() {
		System.out.println("class1 normal method");
	}

	public void display11() {
		System.out.println("class2 abstract method");
	}

	public void display22() {
		System.out.println("class2 normal method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("interface:-");
		System.out.println("");

		Day6_interface d = new Day6_interface();
		d.display1();
		d.display2();
		d.display11();
		d.display22();
	}

}