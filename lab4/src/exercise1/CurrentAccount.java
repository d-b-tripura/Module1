package exercise1;
public class CurrentAccount extends Account {

	double overdraftLimit;

	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	
	@Override
	public void withdraw(double bal) {
		// TODO Auto-generated method stub
		//boolean status = false;
		if(bal<=(super.balance + overdraftLimit)) {
			super.withdraw(bal);
			
		}
		else {
			System.out.println("Overdraft limit reached");
		}
	}
	

	
	
}