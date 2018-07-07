public class Paradise {
	private NumberCube firstDie;
	private NumberCube secondDie;
	
	public Paradise() {
		firstDie = new NumberCube();
		secondDie = new NumberCube();
	}
	
	public int roll() {
		return firstDie.roll() + secondDie.roll(); 
	}
}
