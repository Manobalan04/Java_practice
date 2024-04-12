package week1;

public class Day1 {

//	primitive (boolean,float,char,double,int,long)
	int n1 = -4;
	static boolean flag = true; // static used for print directly
	char ch = 'm';
	static float f1 = 10;
	long lo = 65432;
	double d1 = 543.56;

//	non-primitive (storing multiple values like array)

	int[] arr = { 2, 5, 3, 6 };
	char[] arr1 = { 'm', 'a', 'n', 'o' };
	int[] arr2 = new int[4];

	String c = "this is java"; // class (it is not data type) but it is non-primitive

//	typecasting
//	i) widening typecasting (automatic conversion)
//	ii) narrow typecasting (manual conversion)

	double td = n1; // widening typecasting

	int in = (int) d1; // narrow typecasting

	int in1 = (int) ch; // narrow typecasting

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day1 man = new Day1(); // declare variable for importing and printing from class then it can used for
								// printing

		System.out.println("int-> " + man.n1);
		System.out.println("boolean-> " + flag);
		System.out.println("char-> " + man.ch);
		System.out.println("float-> " + f1);
		System.out.println("long-> " + man.lo);
		System.out.println("double-> " + man.d1);

		System.out.println("printing by array-> " + man.arr[1]);
		System.out.println("printing by array-> " + man.arr1[1]);

		man.arr2[0] = 3; // adding value by void main(later)
		man.arr2[1] = 6;
		man.arr2[2] = 9;
		System.out.println("updating array later by void main-> " + man.arr2[2]);

		System.out.println("printing string-> " + man.c);

		System.out.println("widening typecasting(int->double)-> " + man.td);

		System.out.println("narrow typecasting(double->int)-> " + man.in);
		System.out.println("narrow typecasting(char->int)-> " + man.in1);

	}

}