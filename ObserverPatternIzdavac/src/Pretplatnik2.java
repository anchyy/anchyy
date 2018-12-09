
public class Pretplatnik2 implements Obsever{
	
	Casopis kvartalni;

	
	Izdavac_Tisakdd izd;
	
	public Pretplatnik2(Casopis a ) {
		this.kvartalni=a;
	
			
		// TODO Auto-generated constructor stub
	}
	

		// TODO Auto-generated constructor stub
	public void setObservable(Izdavac_Tisakdd i) {
		this.izd=i;
		izd.lista.add(this);
	}

	@Override
	public void update() {
		System.out.println("Pretplanik2--poslan na mail casopis"+type());
		// TODO Auto-generated method stub
		
	}


	@Override
	public Casopis type() {
		// TODO Auto-generated method stub
		return kvartalni.kvartalni;
	}


	
	}





