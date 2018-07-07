public class TestDice {

	public static void main(String[] args) {
		int[] test = {1, 2, 3, 4};
		reverseArray(test);
	}
	
	public static int[] getCubeTosses(NumberCube cube, int numTosses) {
		int[] results = new int[numTosses];
		
		for (int i = 0; i < numTosses; i ++) {
			results[i] = cube.roll();
		}
		
		return results;
	}
	
	public static void printArray(int[] array) {
		for (int num : array) {
			System.out.print(num + ", ");
		}
		
		System.out.println();
	}
	
	public static int getLongestRun(int[] values){
		int startOfCurrentRun = 0;
		int lengthOfCurrentRun = 1;
		
		int startOfLongestRun = 0;
		int lengthOfLongestRun = 1;
		
		for (int i = 1; i < values.length; i++) {
			if (values[i - 1] == values [i]) {
				lengthOfCurrentRun++;
			} else {
				if (lengthOfCurrentRun > lengthOfLongestRun) {
					lengthOfLongestRun = lengthOfCurrentRun;
					startOfLongestRun = startOfCurrentRun;
				}
				
				lengthOfCurrentRun = 1;
				startOfCurrentRun = i;
			}
		}
		
		if (lengthOfCurrentRun > lengthOfLongestRun) {
			lengthOfLongestRun = lengthOfCurrentRun;
			startOfLongestRun = startOfCurrentRun;
		}
		
		if (lengthOfLongestRun == 1) {
			return -1;
		} else {
			return startOfLongestRun;
		}
	}
	
	public static void reverseArray(int[] values) {
		for (int i = 0; i < values.length / 2; i++) {
			int temp = values[i];
			values[i] = values[(values.length - 1) - i];
			values[(values.length - 1) - i] = temp;			
		}
		
		printArray(values);
	}
	
	private void swap(int i, int j, int[] numbers) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}