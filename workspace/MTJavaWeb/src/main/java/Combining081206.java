import java.util.Arrays;
public class Combining081206 {
	public static void main(String[] args) {
		int[][] imageData={{100,90,255,80,70,255,60,50},
						   {255,10,5,255,10,5,255,255},
						   {255,255,255,0,255,255,255,75},
						   {255,60,30,0,30,60,255,255}};
		
		//����һ��4*6�������У���ԭ�������Ҳ�2��ɾ��������Ԫ�ظ�ֵ��������
		int[][] newImage = new int[4][6];
		
    for(int i = 0;i < newImage.length; i++ ){
      for(int j = 0; j < newImage[0].length; j++){
        newImage[i][j] = imageData[i][j];
      }
    }
		System.out.println(Arrays.deepToString(newImage));
	
		//���������е�ÿ��Ԫ�ض���ȥ50������Ԫ�ز���0����ֵΪ0
		for(int a = 0;a < newImage.length; a++ ){
      for(int b = 0; b < newImage[0].length; b++){
        if(newImage[a][b] >= 50){
          newImage[a][b] -= 50;
        }else{
          newImage[a][b] = 0;
        }

      }
    }
		
		System.out.println(Arrays.deepToString(newImage));
	}
}