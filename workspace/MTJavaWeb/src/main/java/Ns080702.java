public class Ns080702{
	public int naiveSolution(int[]heights) {
		int totalWater = 0 ;                                            //����ˮ��        
		for(int i = 0;i < heights.length - 1;i++) {                     //�ҵ�ˮ��ˮ��λ��i
			int leftBound = 0;
			int rightBound = 0;
			
			for(int j = 0;j<= i;j++) {                                  //ͨ��ѭ���ҵ���߽�
				leftBound =Math.max(leftBound, heights[j]);             //ͨ���Ƚ�ȷ����߽�
			}
			
			for(int j = i;j < heights.length;j++){                      //ͨ��Ѱ�����ұ߽�
				rightBound = Math.max(rightBound, heights[j]);
			}
			
			totalWater += Math.min(leftBound, rightBound)-heights[i];   //ˮ�Ӵ�СΪ���ұ߽�Ľ�Сֵ-ˮ�Ӹ߶�
		}
		return totalWater;                                              //���صõ���ˮ��ֵ��С
	}
}