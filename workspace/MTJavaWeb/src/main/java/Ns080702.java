public class Ns080702{
	public int naiveSolution(int[]heights) {
		int totalWater = 0 ;                                            //定义水坑        
		for(int i = 0;i < heights.length - 1;i++) {                     //找到水坑水坑位置i
			int leftBound = 0;
			int rightBound = 0;
			
			for(int j = 0;j<= i;j++) {                                  //通过循环找到左边界
				leftBound =Math.max(leftBound, heights[j]);             //通过比较确定左边界
			}
			
			for(int j = i;j < heights.length;j++){                      //通过寻找找右边界
				rightBound = Math.max(rightBound, heights[j]);
			}
			
			totalWater += Math.min(leftBound, rightBound)-heights[i];   //水坑大小为左右边界的较小值-水坑高度
		}
		return totalWater;                                              //返回得到的水坑值大小
	}
}