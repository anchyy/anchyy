import java.util.concurrent.ThreadLocalRandom;

public class Robot {
	
	private String name;
	private int id;
	
	public Robot(String name) {
		this.name=name;
		id=ThreadLocalRandom.current().nextInt(0,100);
		// TODO Auto-generated constructor stub
	}
	public void description(){
			System.out.println("Name: "+ name + "id "+id);
	}

}
