import java.util.Arrays;
public class Review081207 {
	public static void main(String[] args) {  

		//����һ��4*3�����飬�������һ��Ԫ��
  double[][] scores ={ {80.4,-1,-1},{96.2,-1,-1},{100.0,-1,-1},{78.9,-1,-1}};
 

  System.out.println(Arrays.deepToString(scores));
    
	//��ֵ�ڶ���Ԫ��
   scores[0][1] = 89.7;
   scores[1][1] = 90.5;
   scores[2][1] = 93.6;
   scores[3][1] = 88.1;

  System.out.println(Arrays.deepToString(scores));
		
  //�´�һ��4*2���У�����ԭ��������Ԫ�ظ�ֵ��������
  double[][] newScores = new double[4][2];

   for(int i = 0 ; i < newScores.length;i++){
     for(int j = 0;j < newScores[0].length;j++){
       newScores[i][j] = scores[i][j];
     }
   }

  System.out.println(Arrays.deepToString(newScores));

  //����������С��90��Ԫ��+2�����ౣ�ֲ��䣬�������
    for(int i = 0 ; i < newScores.length;i++){
      for(int j = 0;j < newScores[0].length;j++){
        if(newScores[i][j] < 90){
          newScores[i][j] += 2;
        }
      }
    }

  System.out.println(Arrays.deepToString(newScores));
	}
}