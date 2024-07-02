
public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney;
    
    
    
//    constructor 
    public BankAccount(double checkingBalance, double savingsBalance) {
    	this.checkingBalance = checkingBalance;
    	this.savingsBalance = savingsBalance;
    	accounts++;
    	totalMoney += (checkingBalance + savingsBalance);
    }  
    
    
//  getters & setters

	public double getCheckingBalance() {
		return checkingBalance;
	}



	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance += checkingBalance;
	}



	public double getSavingsBalance() {
		return savingsBalance;
	}



	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance += savingsBalance;
	}


	public void withdrawFromCheckingBalance(double amount) {
		if( (checkingBalance - amount) >= 0 ) {
				checkingBalance -= amount;
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
	
	
	
	
	  public static int getNumberOfAccounts() {
	    	return accounts;
	    }



	public static void setAccounts(int accounts) {
		BankAccount.accounts += accounts;
	}



	public static double getTotalMoney() {
		return totalMoney;
	}



	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney += totalMoney;
	}

}