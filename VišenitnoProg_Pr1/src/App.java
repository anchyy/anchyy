
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robi=new Robot("Terminator");
		Runnable job=new Threadjob();
	
		Thread thr=new Thread(job);
		thr.setName("First");
		
		
		System.out.println("******************Before in main*****************");
		System.out.println("Messge in main thread before out thread...");
		robi.description();
		thr.start();
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("*******************After in main ******************");
		System.out.println("Message - final in main ...");

	}

}

