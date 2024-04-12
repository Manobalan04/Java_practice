package week2;

import java.io.File;

public class Day8_filedelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File nf = new File("text.txt");

		if (nf.delete()) {
			System.out.println("deleted");
		} else {
			System.out.println("already deleted");
		}

	}

}