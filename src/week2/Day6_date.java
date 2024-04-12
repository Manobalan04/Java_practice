package week2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day6_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("date imbuild method-");
		System.out.println("");

		Date d = new Date();
		System.out.println(d);

		System.out.println(d.getDay());
		System.out.println(d.getDate());
		System.out.println(d.getMonth() + 1);

		d.setDate(2);
		System.out.println(d);

		d.setYear(127);
		System.out.println(d);

		SimpleDateFormat sd = new SimpleDateFormat("MM/dd-yyyy");
		System.out.println(sd.format(d));
	}

}