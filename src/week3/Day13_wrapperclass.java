package week3;

public class Day13_wrapperclass {

	static int m = 4;

	static Integer m1 = new Integer(15);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("compareTo:-");

		System.out.println(+m1.compareTo(19)); // right integer larger means -ve
		System.out.println(m1.compareTo(11)); // left integer larger means +ve
		System.out.println(m1.compareTo(15)); // equal means 0

		System.out.println("");
		System.out.println("compareUnsigned:-");

		System.out.println(Integer.compareUnsigned(18, -28));
		System.out.println(Integer.compareUnsigned(-18, 28));
		System.out.println(Integer.compareUnsigned(-18, -28));
		System.out.println(Integer.compareUnsigned(-18, -18));

	}

}