
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount user1 = new BankAccount(200, 100);
		System.out.println(user1.getCheckingBalance());
		user1.setCheckingBalance(500);
		System.out.println(user1.getCheckingBalance());
		user1.withdrawFromCheckingBalance(200);
		System.out.println(user1.getCheckingBalance());
		user1.withdrawFromCheckingBalance(6000);
		System.out.println(user1.getCheckingBalance());
		
		
		System.out.println("**********************");
		
		BankAccount user2 = new BankAccount(100, 150);
		System.out.println(user2.getCheckingBalance());
		user2.setCheckingBalance(7000);
		System.out.println(user2.getCheckingBalance());
		user2.withdrawFromCheckingBalance(500);
		System.out.println(user2.getCheckingBalance());
		user2.withdrawFromCheckingBalance(50);
		System.out.println(user2.getCheckingBalance());
		user2.withdrawFromCheckingBalance(9000);
		System.out.println(user2.getCheckingBalance());
		
		System.out.println("***************************");
		
		BankAccount user3 = new BankAccount(750, 100);
		System.out.println(user3.getCheckingBalance());
		user3.setCheckingBalance(650);
		System.out.println(user3.getCheckingBalance());
		user3.withdrawFromCheckingBalance(150);
		user3.setCheckingBalance(8000);
		System.out.println(user3.getCheckingBalance());
		user3.withdrawFromCheckingBalance(2500);
		System.out.println(user3.getCheckingBalance());
		user3.withdrawFromCheckingBalance(75);
		System.out.println(user3.getCheckingBalance());
		
		
		System.out.println("Number of Accounts:");
		System.out.println(BankAccount.getNumberOfAccounts());
		
		
	System.out.println("Total money for all three accounts:");
	BankAccount.getTotalMoney();
	System.out.println(BankAccount.getTotalMoney());
	
	

		
		
		
	}

}
