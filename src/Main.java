import static java.lang.System.out; 

public class Main {
	
	public static void main(String[] args) {
		//create BankAccount objects
		BankAccount myAccount = new BankAccount();
		BankAccount yourAccount = new BankAccount();
		myAccount.balance = 150;
		yourAccount.balance = 250;
		//display current value
		myAccount.display();
		yourAccount.display();
		
		//add value
		out.println();
		myAccount.add(1000);
		yourAccount.add(500);
		out.println();
		
		//display current value
		myAccount.display();
		yourAccount.display();
		
		//Subtract value
		out.println();
		myAccount.substract(1000);
		yourAccount.substract(500);
		
		//display value
		out.println();
		myAccount.display();
		yourAccount.display();
	}
}