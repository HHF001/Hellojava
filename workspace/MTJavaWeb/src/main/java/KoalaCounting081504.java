class KoalaCounting081504 {
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
	          //找到二位数组中大于某数的数量
	public static int findValuesGreaterThan(int[][] arr2D, int num) {
    int total = 0;
    for (int row = 0; row < arr2D.length; row++) {
        for (int col = 0; col < arr2D[0].length; col++) {
            if (arr2D[row][col] > num) {
                total += 1;
            }
        }
    }
    return total;
}
            //查找二维数组中最大值的列
	public static int largestColumn(int[][] arr2D) {
		int largestColumn = 0;
		int largestNumber = 0;
		for(int i = 0;i < arr2D[0].length;i++) {             //遍历列
			int columnVal = 0;
			for(int j = 0;j <arr2D.length;j++) {             //遍历每列里面每行的值并求和
				columnVal += arr2D[j][i];
			}
			if(columnVal > largestColumn) {                   //找到各列的最大值
				largestColumn = columnVal;
				largestNumber = i;                            //找到最大值的列数
			}
		}
		return largestNumber;
	}
  public static void main(String[] args) {
	  
	int[][] koalaSpottings0 = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};
	System.out.println(getTotal(koalaSpottings0));

    int[][] koalaSpottings = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};
    System.out.println(findValuesGreaterThan(koalaSpottings, 20));
    
    int[][] koalaSpottings1 = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};
    System.out.println(largestColumn(koalaSpottings1));
  }
}