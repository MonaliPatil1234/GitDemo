import BasicJava.CentralTraffic;
import BasicJava.ContinentTraffic;

public class AusTraffic implements CentralTraffic,ContinentTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AusTraffic();
		a.redStop();
		a.greenGo();
		a.yellowWait();
		AusTraffic at = new AusTraffic();
		at.walkOnSymbol();
		ContinentTraffic ct = new AusTraffic();
		ct.trainSymbol();
		
		
	}

	public void walkOnSymbol() {
		System.out.println("WALK ON SYMBOL");

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("GREENGO IMPLEMENTATION");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("REDSTOP IMPLEMENTATION");

	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("YELLOWWAIT IMPLEMENTATION");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("STOP WHEN TRAIN SYMBOL");
	}

}
