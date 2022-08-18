import java.util.Scanner;

public class DemoOne081801{
	public static void main(String[] args) {
		//创建一个变量score来储存学生成绩
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个学生成绩，我将告诉您成绩状况");
		int score = input.nextInt();
		//利用成绩的值，来判断所在区间
		switch(score/10) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("不及格");
			break;
		case 6:
			System.out.println("及格");
			break;
		case 7:
			System.out.println("还行");
			break;
		case 8:
			System.out.println("比较好");
			break;
		case 9:
			System.out.println("优秀");
			break;
		case 10:
			//一百多分：100--109
			if(score == 100) {
			System.out.println("满分");
			break;
			}
		default:
			System.out.println("没你这号人");
		}
		
	}
}