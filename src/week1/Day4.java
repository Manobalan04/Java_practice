package week1;

public class Day4 {

//	advanced for loop
	static int[] arr = { 1, 2, 3 };

//	OOPS
//	i)  Objects/ Attributes (declaring variable in class, it cannot be used above class)
//  ii) class name only have to give for constructor name

//	constructor
	Day4() {
		System.out.println("constructor:-");
		System.out.println("java");
	}

//	
	Day4(int a) {
		System.out.println("constructor using args:-");
		System.out.println("world");
	}

//	
//	two args passing in constructor
	public int n;
	public String s;

	public Day4(int c, String d) {
		n = c;
		s = d;
		System.out.println("hi");
	}

//	encapsulation (OOPS)
	private static int x = 10;

	public static int get() {
		return x;
	}

	public static void set(int a) {
		x = a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		advanced for loop
		System.out.println("advance for loop:-");

		for (int z : arr) {
			System.out.println(z);
		}

//		OOPS (Object Oriented Programming language)
//		i)  Objects/ Attributes (declaring variable in class, it cannot be used above class)
//      ii) class name only have to give for constructor name

//		constructor
		Day4 d1 = new Day4();
		Day4 d2 = new Day4(4);

		System.out.println("constructor by two args:-");
		Day4 d3 = new Day4(5, "mano");
		System.out.println(d3.n);
		System.out.println(d3.s);

//		encapsulation (OOPS)
		System.out.println("encapsulation:-");
//		
		System.out.println(get()); // return
//		
		System.out.println("updated encapsulation:-");
//		
		set(21);
		System.out.println(d1.get()); // void

	}

}