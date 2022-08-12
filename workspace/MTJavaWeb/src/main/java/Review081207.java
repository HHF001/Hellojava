import java.util.Arrays;
public class Review081207 {
	public static void main(String[] args) {  

		//创建一个4*3数列组，并存入第一列元素
  double[][] scores ={ {80.4,-1,-1},{96.2,-1,-1},{100.0,-1,-1},{78.9,-1,-1}};
 

  System.out.println(Arrays.deepToString(scores));
    
	//赋值第二列元素
   scores[0][1] = 89.7;
   scores[1][1] = 90.5;
   scores[2][1] = 93.6;
   scores[3][1] = 88.1;

  System.out.println(Arrays.deepToString(scores));
		
  //新创一个4*2数列，并把原数列两列元素赋值给新数列
  double[][] newScores = new double[4][2];

   for(int i = 0 ; i < newScores.length;i++){
     for(int j = 0;j < newScores[0].length;j++){
       newScores[i][j] = scores[i][j];
     }
   }

  System.out.println(Arrays.deepToString(newScores));

  //把新数列中小于90的元素+2，其余保持不变，输出数列
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