import java.util.Random;

public class LuckyFive081201 {
  
  public static void main(String[] args) {
    
    // 创建随机数字生成器对象
    Random randomGenerator = new Random();
    
    // 利用对象生成一个1-6的随机数字
    int dieRoll = randomGenerator.nextInt(6) + 1;

    // 当生成的数字是5时跳出循环
    while(dieRoll != 5){
      System.out.println(dieRoll);
      dieRoll = randomGenerator.nextInt(6) + 1;
      
    }
  }
}