public class NumberCube {
	private int sides;
	
	public static final int DEFAULT_SIDES = 6;
	public static final int MINIMUM_SIDES = 4;
	public static final int MAXIMUM_SIDES = 100;
	
	public NumberCube() {
		sides = DEFAULT_SIDES;
	}
	
	public NumberCube(int number) {
		if (number > MAXIMUM_SIDES || number < MINIMUM_SIDES) {
			sides = DEFAULT_SIDES;
		}		
		sides = number;
	}
	
	public int roll() {
		return (int)(Math.random() * sides + 1);
	}
}