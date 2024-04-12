package week3;

public class Day14_Stringimbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello java";

		System.out.println("charAt-> " + s.charAt(6)); // charAt

		System.out.println("concat-> " + s.concat("backend")); // concat

		System.out.println("contains-> " + s.contains("llo")); // contains

		System.out.println("contentEquals-> " + s.contentEquals("hello java")); // contentEquals
		System.out.println(s.contentEquals("hell java"));

		System.out.println("equals-> " + s.equals("hello java")); // equals
		System.out.println(s.equals("hell java"));

		System.out.println("startsWith-> " + s.startsWith("hello java")); // startsWith

		System.out.println("endsWith-> " + s.endsWith("va")); // endsWith

		System.out.println("indexOf-> " + s.indexOf('o')); // indexOf
		System.out.println(s.indexOf('l', 2));

		System.out.println("lastIndexOf-> " + s.lastIndexOf("a")); // lastIndexOf

//		split
		System.out.println();
		System.out.println("split:-");
		String[] s1 = s.split("");
		for (String a : s1) {
			System.out.println(a);
		}

//		copyValueOf
		System.out.println();
		System.out.println("copyValueOf:-");
		char[] ch = { 'b', 'e', 'n', 't', 'l', 'y' };
		System.out.println(s.copyValueOf(ch));

		System.out.println("");
		System.out.println("repeat-> " + s.repeat(2)); // repeat

		String s2 = " ";
		System.out.println("isBlank-> " + s2.isBlank()); // isBlank

		System.out.println("isEmpty-> " + s2.isEmpty()); // isEmpty

		System.out.println("replace-> " + s.replace("java", "python")); // replace

		System.out.println("subString-> " + s.substring(1, 5)); // subString
		System.out.println(s.substring(3));

		System.out.println("join-> " + String.join("$", s1)); // join (conversion array to string)

	}

}
