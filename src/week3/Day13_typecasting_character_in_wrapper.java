package week3;

public class Day13_typecasting_character_in_wrapper {

	static Character c = new Character('b');

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(c.compareTo('d'));

		System.out.println(c.charValue());

		System.out.println(Character.isAlphabetic('m'));

		System.out.println(Character.isAlphabetic(1));

		System.out.println(Character.isLetterOrDigit(1));

		System.out.println(Character.isLetterOrDigit('$'));

		System.out.println(Character.isWhitespace(' '));

		System.out.println(Character.isLowerCase('D'));

		System.out.println(Character.MIN_VALUE);

	}

}