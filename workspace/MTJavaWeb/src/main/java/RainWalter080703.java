public class RainWalter080703{
	
	public int efficientSolution(int[] heights) {
		int totalWater = 0;
		int leftPointer = 0;
		int rightPointer = heights.length -1;
		int leftBound = 0;
	    int rightBound = 0;
		
		return totalWater;
	}
	
	public static void main(String[] args) {
		int [] heights = new int[]{4, 2, 1, 3, 0, 1, 2};
	    RainWalter080703 rainWater = new RainWalter080703();
	    System.out.println("Amount of water captured: " + rainWater.efficientSolution(heights));
	}
}