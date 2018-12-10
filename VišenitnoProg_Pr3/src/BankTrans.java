
public class BankTrans implements Runnable {

	private BnkAcc account;

	public BankTrans(BnkAcc acc) {
		this.account = acc;

	}

	@Override
	public void run() {
		for (int k = 1; k <= 10; k++) {
			makeWithDrawal(125);
		}
		// TODO Auto-generated method stub

	}

	private synchronized void  makeWithDrawal(double amount) {
		if (amount <= account.getBalance()) {
			System.out.println(Thread.currentThread().getName() +" je podignuo: " + amount + " kuna");
			account.withdrawFromAcc(amount);
			System.out.println("preostali iznos je: " + account.getBalance());
			System.out.println("*****************************");
		} else {
			System.out.println("nedovoljno sredstava na računu, preostalo je: " + account.getBalance());
		}

	}

}
