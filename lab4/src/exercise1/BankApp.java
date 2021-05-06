package exercise1;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account();
		Person obj1 = new Person();
		obj1.setName("smith");
		a.setAccHolder(obj1);
		a.setBalance(2000);
		a.setAccNum();
		
		a.deposit(2000);
		
		Account acc = new Account();
		Person obj2 = new Person();
		obj2.setName("Kathy");
		acc.setAccHolder(obj2);
		acc.setBalance(3000);
		acc.setAccNum();
		
		acc.withdraw(2000);
		
		System.out.println("Updated balance of Smith(" + a.getAccNum() + "): " +a.getBalance());
		System.out.println("Updated balance of Kathy: " +acc.getBalance());
		
		
		//savings and current usage
		Account ac1 = new SavingsAccount();
		Person p1 = new Person();
		p1.setName("Smith");
		ac1.setAccHolder(p1);
		ac1.setBalance(200);
		ac1.setAccNum();
		ac1.withdraw(100);
		//acc.deposit(2000);
		
		System.out.println(ac1.getBalance());
		
		CurrentAccount ac2 = new CurrentAccount();
		Person p2 = new Person();
		p2.setName("smith");
		ac2.setOverdraftLimit(10000);
		ac2.setAccHolder(p2);
		ac2.setBalance(200);
		ac2.setAccNum();
		
		ac2.withdraw(1000000);
		//acc.deposit(2000);
		
		System.out.println(ac2.getBalance());
		
	}

}