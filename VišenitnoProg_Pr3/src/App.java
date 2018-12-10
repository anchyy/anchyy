
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BnkAcc account = new BnkAcc(1000.00);
		Runnable transaction = new BankTrans(account);
		Thread entOne = new Thread(transaction, "ivan");
		Thread entTwo = new Thread(transaction, "ivanov brat");


		entOne.start();
		entTwo.start();

	}

}
