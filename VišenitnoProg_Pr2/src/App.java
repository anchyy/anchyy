
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable job=new Thraedjob();
		
		Thread one=new Thread(job);
		Thread two=new Thread(job);
		
		one.setName("Thread one");
		two.setName("Thred two");
		
		Robot rob=new Robot("Ter");
		
		System.out.println("Before in main");
		rob.description();
		one.start();
		two.start();
	
		System.out.println("After in maain");
		System.out.println("Line after starting threads...");
		
		

	}

}
