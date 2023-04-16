import static java.lang.System.out;

public class BankAccount {
	public double balance;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	private String name;
	
	public void display() {
		out.println(balance);
		//out.println(name);
	}
	
	public void add (double amount) {
		balance += amount;
	}
	
	public void substract (double amount) {
		balance -= amount;
	}
	
}

