import java.util.Random;

public class LuckyFive081201 {
  
  public static void main(String[] args) {
    
    // ���������������������
    Random randomGenerator = new Random();
    
    // ���ö�������һ��1-6���������
    int dieRoll = randomGenerator.nextInt(6) + 1;

    // �����ɵ�������5ʱ����ѭ��
    while(dieRoll != 5){
      System.out.println(dieRoll);
      dieRoll = randomGenerator.nextInt(6) + 1;
      
    }
  }
}