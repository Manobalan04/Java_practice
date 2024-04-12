package week3;

public class Day14_enum {

	enum priority {
		initial, inprocess, completed
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(priority.initial);

		priority status = priority.valueOf("inprocess");
		System.out.println(status);

	}

}