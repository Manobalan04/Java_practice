package week3;

public class Day14_innerclass {
	int b = 10;

	class innerclass1 {
		int a = 5;
	}

//	static class innerclass1 {
//		int a = 5;
//	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day14_innerclass.innerclass1 in = new Day14_innerclass().new innerclass1();
		System.out.println(in.a);

//		if class given in static below method to be used:-
//		Day14_innerclass.innerclass1 in = new Day14_innerclass.innerclass1();
//		System.out.println(in.a);

		Day14_innerclass in1 = new Day14_innerclass();
		System.out.println(in1.b);

	}

}