package srp;

public abstract class BankAccountSaving {
	// Class Description: Saving Account
	public void Deposit(double amount, BankAccount Account) {
		Double balance = Account.get_balance();
		Account.set_balance(balance + amount);
	};
	
	public void Withdraw(double amount, BankAccount Account) {
		Double balance = Account.get_balance();
		Account.set_balance(balance - amount);
	};
	
	public void AddInterest(double amount, BankAccount Account) {
		
	};
	
	public void Transfer(double amount,BankAccount fromAccount, BankAccount toAccount) {
		Double balance = fromAccount.get_balance();
		fromAccount.set_balance(balance - amount);
		
		balance = toAccount.get_balance();
		toAccount.set_balance(balance + amount);
	};
	}
