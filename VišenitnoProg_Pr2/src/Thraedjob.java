
public class Thraedjob implements Runnable {

	@Override
	public void run() {
		for (int k=1; k<20; k++) {
			System.out.println("Runin thread:"+Thread.currentThread().getName());
			
		}
		// TODO Auto-generated method stub
		
	}

}
