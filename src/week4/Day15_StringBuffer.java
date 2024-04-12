package week4;

public class Day15_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("python");
		String s2 = new String("python");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));

		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("java");

		sb1.append("script");
		sb2.deleteCharAt(3);

		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1.equals(sb2));

	}

}
