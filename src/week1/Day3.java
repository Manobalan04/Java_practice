package week1;

public class Day3 {

//	Methods/ Functions
//	void and return

//	void (without arguments/parameters)
	static void addandsub() {
		System.out.println("void-> " + "hello");
		System.out.println("void-> " + (10 - 5));
	}

//	void (with arguments/parameters)
	static void addsub(int a, int b) {
		System.out.println("void with arguments-> " + "hi");
		System.out.println("void with arguments-> " + (a - b));
	}

//	return
	static int mulanddiv() {
		System.out.println("return-> " + "java");
		System.out.println("return-> " + (10 - 3));

		return 4;
	}

	static int add(int a, int b) {

		System.out.println("adding_" + a + " adding_" + b);
		return a + b;
	}

//	method overloading

	static void addandsub(int a, int b) {
		System.out.println(a + b);
	}

	static void addandsub(int a) {
		System.out.println(a);
	}

	static void addandsub(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Methods/ Functions

//		void (without arguments/parameters)
		addandsub();

//		void (with arguments/parameters)
		addsub(10, 12);
		addsub(10, 6);

//		return
		int nm = mulanddiv();
		System.out.println(nm);

		System.out.println("return with arguments:-"); // for recognise purpose in output
//		
		System.out.println(add(10, 5));
		System.out.println(add(10, 25));

//		method overloading
		System.out.println("method overloading:-"); // for recognise purpose in output
//		
		addandsub(5, 5);
		addandsub(5);
		addandsub("mano");

//		
//	    switch case
		System.out.println("switch case:-");
//	    
		switch ("java") {
		case "python":
			System.out.println("python");
			break;

		case "java":
			System.out.println("java");
			break;

		default:
			System.out.println("not valid");
			break;
		}

//	    
//	    jumping statement
//	    i)  break
//	    ii) continue 

//	    break
		System.out.println("break statement:-");
//	    
		for (int i = 3; i < 10; i++) {
			if (i % 2 == 0) {
				break;
			}
			System.out.println(i);
		}

//	    continue (it means skip), when it meets the condition)
		System.out.println("continue statement:-");
//	    
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}