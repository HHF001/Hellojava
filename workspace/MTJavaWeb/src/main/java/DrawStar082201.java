import java.util.Scanner;

public class DrawStar082201{
	public static void main(String[] args) {
		/*//������
		System.out.println("�𾴵Ŀͻ���������Ҫ������");
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		for(int i = 0 ; i < count;i++) {
			System.out.print("*");                   //����� ****
		}*/
		int count = 4; //ÿһ�����ǵĸ�������
		for(int i = 1;i <= count;i++) {
			for(int j = 1;j <= count;j++) {
				System.out.print("*");              //���4�У� ****
			}
			System.out.println();
		}
	}
}