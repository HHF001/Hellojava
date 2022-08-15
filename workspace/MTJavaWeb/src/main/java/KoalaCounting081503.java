 class KoalaCounting081503{
	   //二维数组中的所有数求和
	public static int getTotal(int[][] arr2D) {
	    int total = 0;
	    for (int row = 0; row < arr2D.length; row++) {
	        for (int col = 0; col < arr2D[0].length; col++) {
	            total += arr2D[row][col];
	        }
	    }
	    return total;
	}
	public static void main(String[] args) {

	    int[][] koalaSpottings = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};
	    System.out.println(getTotal(koalaSpottings));
	  }
}