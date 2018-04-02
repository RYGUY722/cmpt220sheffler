
public class CheckingAccount extends Account{
	private double overdraft;
	public CheckingAccount() {
		super();
		overdraft=100;
	}
	public CheckingAccount(int id, double balance, int interestRate, double overdraftLimit) {
		super(id, balance, interestRate);
		overdraft = overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return overdraft;
	}
	
	public void setOverdraftLimit(double overdraftLimit) {
		overdraft = overdraftLimit;
	}

	public void withdraw(double amount) {
		if ((getBalance()+overdraft)-amount>=0) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Not enough funds");
	}

	public String toString() {
		return super.toString() + ", Overdraft limit: $"+overdraft;
	}
}
