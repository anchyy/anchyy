
public class BnkAcc {
	
	private double balance;
	
	public BnkAcc(double amn) {
		this.balance=amn;
		// TODO Auto-generated constructor stub
	}
	public double getBalance() {
		return balance;
	}
	
	public void withdrawFromAcc(double amnt) {
		balance=balance-amnt;
	}

}
