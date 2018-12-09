
public class Pretplatnik1 implements Obsever{
	Casopis mjesecni;
	
	Izdavac_Tisakdd izd;
	
	public Pretplatnik1(Casopis s) {
		this.mjesecni=s;
		// TODO Auto-generated constructor stub
	}
	

		// TODO Auto-generated constructor stub
	public void setObservable(Izdavac_Tisakdd i) {
		this.izd=i;
		izd.lista.add(this);
	}

	@Override
	public void update() {
		System.out.println("Pretplatnik1---poslan na mail casopis"+type());
		// TODO Auto-generated method stub
		
	}


	@Override
	public Casopis type() {
		// TODO Auto-generated method stub
		return mjesecni.mjesecni;
	}



	}


