import java.util.Scanner;

public class DrawStar082201{
	public static void main(String[] args) {
		/*//复用性
		System.out.println("尊敬的客户，您到底要画几个");
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		for(int i = 0 ; i < count;i++) {
			System.out.print("*");                   //输出： ****
		}*/
		int count = 4; //每一行星星的个数随意
		for(int i = 1;i <= count;i++) {
			for(int j = 1;j <= count;j++) {
				System.out.print("*");              //输出4行： ****
			}
			System.out.println();
		}
	}
}