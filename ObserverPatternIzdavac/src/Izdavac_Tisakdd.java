import java.util.ArrayList;

public class Izdavac_Tisakdd implements Observable {
	

	
	Pretplatnik1 p1;
	Pretplatnik2 p2;
	Pretplatnik3 p3;
	
	Casopis mjesecni;
	Casopis kvartalni;
	
	ArrayList<Obsever>lista;
	
	public Izdavac_Tisakdd() {
		lista=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	

	
	@Override
	public void add(Obsever a) {
		lista.add(a);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Obsever b) {
		lista.remove(b);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notifyObs() {
		for(Obsever o:lista) {
			if(o.type().equals(Casopis.kvartalni)){
				o.update();
			}else if(o.type().equals(Casopis.mjesecni)) {
				o.update();
			}
		}
		// TODO Auto-generated method stub
		
	}public void setChange(Casopis c) {
		notifyObs();
	
		
		}
		
	}


