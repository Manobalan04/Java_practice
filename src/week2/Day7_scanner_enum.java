package week2;

import java.util.Scanner;

enum task {
	INITIAL, INPROCESS, COMPLETED
}

public class Day7_scanner_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("enter the task update:-");
		String status = s.nextLine();

		task t = task.valueOf(status);
		System.out.println(t);

	}

}