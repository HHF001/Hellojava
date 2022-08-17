import java.lang.Math;     //lang包可省略不用调用 ,调用math类
import java.util.Scanner;

public class DiceGame081704{
	public static void main(String[] args) {
		//1.随机摇骰子的过程 随机产生一个1-6的整数    math-->Scanner  (1.import 2.new 3.input.next())
		double value = Math.random();      //0.0-1.0之间的随机小数 [0.0, 1.0）   0.0 --0.9999999
		int number = (int)(value*6+1);     
		//2.让玩家猜测大学  大/小
		Scanner input = new Scanner(System.in);
		System.out.println("买大买小，买定离手");
		String choose = input.nextLine();     //读取输入的数字
		
		//3.比较点数与猜测结果
		System.out.println("本次摇出的数字为：" +number);
		if((number <= 3 && choose.equals("小")) || (number>3 && choose.equals("大"))) {
			System.out.println("恭喜您，猜对了");
		}else {
			System.out.println("对不起，猜错啦，给两块钱");
		}
	}
}