import java.util.Scanner;

public class DemoOne081801{
	public static void main(String[] args) {
		//����һ������score������ѧ���ɼ�
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��ѧ���ɼ����ҽ��������ɼ�״��");
		int score = input.nextInt();
		//���óɼ���ֵ�����ж���������
		switch(score/10) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("����");
			break;
		case 7:
			System.out.println("����");
			break;
		case 8:
			System.out.println("�ȽϺ�");
			break;
		case 9:
			System.out.println("����");
			break;
		case 10:
			//һ�ٶ�֣�100--109
			if(score == 100) {
			System.out.println("����");
			break;
			}
		default:
			System.out.println("û�������");
		}
		
	}
}