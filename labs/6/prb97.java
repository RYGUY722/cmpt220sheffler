
public class prb97 {
	public static void main(String[] args) {
		Account myacc=new Account(1122,20000);
		myacc.setInterestRate(4.5);
		myacc.withdraw(2500);
		myacc.deposit(3000);
		System.out.println(myacc.getBalance()+", "+myacc.getMonthlyInterest()+", "+myacc.getDateCreated());
	}

}
