package bankAccount;

public class SavingsAccount extends BankAccount {
	private double interestRate;
	SavingsAccount(String accNumber, double interestRate){
		super("");
		this.interestRate=interestRate;
		
	}
	void withdraw(double amount) {
		
	}

}
