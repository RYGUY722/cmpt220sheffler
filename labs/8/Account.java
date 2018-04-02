import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	//Constructor
	Account(){
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated=new Date();
	}
	Account(int newid, double newbalance, int newInterestRate){
		id=newid;
		balance=newbalance;
		annualInterestRate=newInterestRate;
		dateCreated=new Date();
	}
	//Mutator
	void setID(int newid){
		id=newid;
	}
	void setBalance(double newbalance){
		balance=newbalance;
	}
	void setInterestRate(double newannualInterestRate){
		annualInterestRate=newannualInterestRate;
	}
	//Accessor
	int getID(){
		return id;
	}
	double getBalance(){
		return balance;
	}
	double getInterestRate(){
		return annualInterestRate;
	}
	String getDateCreated() {
		return dateCreated.toString();
	}
	//Other
	double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	double getMonthlyInterest() {
		return balance*(getMonthlyInterestRate()/100);
	}
	void withdraw(double amount) {
		balance-=amount;
	}
	void deposit(double amount) {
		balance+=amount;
	}
	public String toString() {
		return "Balance=$"+balance+", Annual interest rate="+annualInterestRate+"%, Date created= "+dateCreated.toString();
	}
}
