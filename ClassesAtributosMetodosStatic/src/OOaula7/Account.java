package OOaula7;

public class Account {

	private int number;
	private double balance;
	public	String holder;
	
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void repairName (String newHolder) {
		holder = newHolder;
	}
	
	public void deposit(double amount ) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		if(amount > balance) {
			System.out.println("Sua conta não possui este valor para deposito."
					+ "Seu saldo atual é: " + balance);
		}
		else {
			balance -= amount+5;
		}
	}

	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + balance;
	}
	
	
}
