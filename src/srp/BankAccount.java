package srp;

public abstract class BankAccount {
	private double _balance;

	public double get_balance() {
		return _balance;
	}

	public void set_balance(double _balance) {
		this._balance = _balance;
	}
	}