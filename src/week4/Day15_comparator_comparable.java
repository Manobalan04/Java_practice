package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class world implements Comparable<world> {

	world(String a, int b) {

		this.name = a;
		this.rollno = b;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int rollno;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public int compareTo(world o) {
		// TODO Auto-generated method stub
		return this.getRollno() - o.getRollno();
	}

}

public class Day15_comparator_comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<world> l = new ArrayList<world>();
		l.add(new world("java5", 4));
		l.add(new world("java6", 2));
		l.add(new world("java4", 0));

		Collections.sort(l);
		System.out.println(l);
		for (world w : l) {
			System.out.println(w.getRollno());
		}

	}

}
