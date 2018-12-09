
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Izdavac_Tisakdd izd=new Izdavac_Tisakdd();
		Pretplatnik1 p1=new Pretplatnik1(Casopis.mjesecni);
		Pretplatnik2 p2=new Pretplatnik2(Casopis.kvartalni);
		p1.setObservable(izd);
		p2.setObservable(izd);
		izd.notifyObs();
		
	
	}

}
