package exercise1;
import java.util.concurrent.ThreadLocalRandom;

public class Account {

	 protected long accNum;
	 protected double balance;
	 protected String accountType;
	 Person accHolder;
	 
	 public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum() {
		long y = ThreadLocalRandom.current().nextLong(1000,10000);
		this.accNum = y;
	}
	
	//get account balance
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	//deposit method
	public void deposit(double bal) {
		balance += bal;
		
	}
	
	//withdrawing
	public void withdraw(double bal) {
	//	if(accountType == "savings")
		if(balance >= bal) {
			balance -= bal;
		}
		
	}
	public void getDetails() {
		System.out.println("Account holder name: "+accHolder.getName());
		System.out.println("");
	}
	
	
	
	
	
}