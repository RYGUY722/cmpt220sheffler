
public class SavingsAccount extends Account{
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(int id, double balance, int interestRate) {
		super(id, balance, interestRate);
	}
	
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Not enough money in account.");
	}
}
