package day3.task1;
import java.util.*;
public class BankApp {

	public static void main(String[] args) {
		
		
		/* business use case
		 * -------------------
		 * if balance is less than 10,000 :- account holder cannot withdrawal 
		 * in such case account status should be inactive.
		 *  
		 * */
		Scanner sc = new Scanner(System.in);
		BankAccount b = new BankAccount();
		b.setAccountHolderName("Sahiti");
		b.setBalance(20000);
		while(true) {
			System.out.println("Choose Function:\n1.Get Account Balance\n2.Get Account Status\n3.Withdraw Amount\n4.Deposit Amount\n5.Exit\nEnter choice number:");
			int n = sc.nextInt();
			switch(n) {
				case 1:
					System.out.println("Current Balance" + b.getBalance());
					break;
				case 2:
					System.out.println("Is it active account:" + b.isStatus());
					break;
				case 3:
					System.out.println("Enter withdrawl Amount:");
					int amt = sc.nextInt();
					b.doWithdrawal(amt);
					break;
				case 4:
					System.out.println("Enter Deposit Amount:");
					int amt1 = sc.nextInt();
					b.doDeposit(amt1);
					break;
				case 5:
					System.exit(0);
			}
		}
		
	/*	System.out.println(b.getAccountHolderName() + " - " + b.getBalance() + " - " + b.isStatus());
		b.doWithdrawal(10001);
		System.out.println(b.getAccountHolderName() + " - " + b.getBalance() + " - " + b.isStatus());
		b.doDeposit(5000);
		System.out.println(b.getAccountHolderName() + " - " + b.getBalance() + " - " + b.isStatus());
		*/
	}
}