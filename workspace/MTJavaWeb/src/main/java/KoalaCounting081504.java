class KoalaCounting081504 {
	       //��ά�����е����������
	public static int getTotal(int[][] arr2D) {
	    int total = 0;
	    for (int row = 0; row < arr2D.length; row++) {
	        for (int col = 0; col < arr2D[0].length; col++) {
	            total += arr2D[row][col];
	        }
	    }
	    return total;
	}
	          //�ҵ���λ�����д���ĳ��������
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
            //���Ҷ�ά���������ֵ����
	public static int largestColumn(int[][] arr2D) {
		int largestColumn = 0;
		int largestNumber = 0;
		for(int i = 0;i < arr2D[0].length;i++) {             //������
			int columnVal = 0;
			for(int j = 0;j <arr2D.length;j++) {             //����ÿ������ÿ�е�ֵ�����
				columnVal += arr2D[j][i];
			}
			if(columnVal > largestColumn) {                   //�ҵ����е����ֵ
				largestColumn = columnVal;
				largestNumber = i;                            //�ҵ����ֵ������
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