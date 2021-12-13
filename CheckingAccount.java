
public class CheckingAccount extends BankAccount {
	private double interest = 0.075;
	private int wCount = 1;
	private int limit = 4;
	
	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount();
		acct.deposit (10000);
		acct.withdraw(1000000);
		
		
	}
	
	@Override
	public void withdraw (double amount) {
		if (wCount < limit) {
			super.withdraw(amount);
			++wCount;
		}else {
			double interestToCharge = amount*interest;
			amount = amount + interestToCharge;
			System.out.println("Interest $"+interestToCharge);
			super.withdraw(amount);
			wCount = 1 ;
		}
	}
}
