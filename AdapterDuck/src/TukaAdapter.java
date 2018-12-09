
public class TukaAdapter implements Patka{
	Tuka tuka;
	
	public TukaAdapter(Tuka tuka) {
		this.tuka=tuka;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void quack() {
		tuka.gobble();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		for(int i=0; i<5; i++) {
			tuka.fly();
		}
		// TODO Auto-generated method stub
		
	}

}
