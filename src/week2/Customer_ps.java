package week2;

public class Customer_ps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank_ps b = new Bank_ps(8000);
		System.out.println(b.getBalance());
		b.withdraw(500);
		System.out.println(b.getBalance());
	}

}