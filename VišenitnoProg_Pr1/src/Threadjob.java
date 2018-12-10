
public class Threadjob implements Runnable {

	@Override
	public void run() {
		
		run2();
		System.out.println(Thread.currentThread().getName());

	}
	public void additionalMethod() {
		System.out.println("Some message from thread one...");
	}
	public void run2() {
		additionalMethod();
	}

}
