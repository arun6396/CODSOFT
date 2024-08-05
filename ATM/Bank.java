package ATM;

public class Bank {

	private double balance;

	public Bank(double initialBalance) {
		this.balance = initialBalance;

	}

	public double getCash() {
		return balance;
	}
	public boolean depositeAmount(double amount) {
		if(amount>0) {
			balance += amount;
			return true;
		}
		return false;
	}
	
	public boolean withdrawAmount(double amount) {
		if(amount<=balance && amount >0) {
			balance -= amount;
			return true;
		}
		return false;
	}
	
	
	
}
