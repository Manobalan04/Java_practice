package week3;

public class Day13_typecasting_integer_in_wrapperclass {

	static Integer m = new Integer(44);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		string to integer
		System.out.println(Integer.valueOf("10") + 5);

//		string to int
		System.out.println(Integer.parseInt("10") + 5);

//		integer to float,int,double
		System.out.println(m.floatValue());

		System.out.println(Integer.MIN_VALUE);

	}

}