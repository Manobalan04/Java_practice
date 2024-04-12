package week2;

import java.util.Scanner;

public class Day7_scanner_divisible_by_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("enter size of array");
		int size = s.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("enter the element of array");
			int n = s.nextInt();
			arr[i] = n;
		}

		for (int a : arr) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}
	}

}