package week2;

public class Day7_thread extends Thread {

	static int n = 6;

	public void run() {
		n++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day7_thread th = new Day7_thread();
		th.start();
		while (th.isAlive()) {
			System.out.println("running...");
		}

//		System.out.println(n); 
		System.out.println(n);

		n++;
		System.out.println(n);

	}

}