
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DivljaPatka dp=new DivljaPatka();
		DivljaTuka dt=new DivljaTuka();
		TukaAdapter ta=new TukaAdapter(dt);
		
		System.out.println("Tuka kaze");
		dt.gobble();
		dt.fly();
		
		System.out.println("Patka kaze");
		dp.quack();
		dp.fly();
		
		System.out.println("TukaAdapter kaze") ;
			testirajPatku(dp);
		}
	

		
	public static void testirajPatku(Patka patka) {
		patka.quack();
		patka.fly();
	}
		
	}


