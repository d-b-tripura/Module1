package day3.task1;
public class BankAccount {

	private String accountHolderName;
	private int balance;
	private boolean status; // true for active / false for inactive
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
		if(balance > 10000) {
			status = true;
		} else {
			status = false;
		}
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	// -------- 
	
	// business methods
	public int doWithdrawal(int amount)
	{
		if(status == true && ((balance - amount) > 9999)) {
			balance = balance - amount;
			System.out.println("Successful");
		} else {
			System.out.println("Inactive");
		}
		if(balance < 10000) {
			status = false;
		} else {
			status = true;
		}
		return balance; // new balance
	}
	
	public int doDeposit(int amount)
	{
		balance += amount;
		System.out.println("Successfully deposited");
		if(balance < 10000) {
			status = false;
		} else {
			status = true;
		}
		return balance;
	}
	
}