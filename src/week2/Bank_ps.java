package week2;

public class Bank_ps {

	private int deposit;

	Bank_ps(int dep) {
		deposit = dep;
	}

	void withdraw(int widthdrawAmount) {
		deposit = deposit - widthdrawAmount;
	}

	int getBalance() {
		return deposit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}