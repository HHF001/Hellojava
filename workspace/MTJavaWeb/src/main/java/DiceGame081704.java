import java.lang.Math;     //lang����ʡ�Բ��õ��� ,����math��
import java.util.Scanner;

public class DiceGame081704{
	public static void main(String[] args) {
		//1.���ҡ���ӵĹ��� �������һ��1-6������    math-->Scanner  (1.import 2.new 3.input.next())
		double value = Math.random();      //0.0-1.0֮������С�� [0.0, 1.0��   0.0 --0.9999999
		int number = (int)(value*6+1);     
		//2.����Ҳ²��ѧ  ��/С
		Scanner input = new Scanner(System.in);
		System.out.println("�����С��������");
		String choose = input.nextLine();     //��ȡ���������
		
		//3.�Ƚϵ�����²���
		System.out.println("����ҡ��������Ϊ��" +number);
		if((number <= 3 && choose.equals("С")) || (number>3 && choose.equals("��"))) {
			System.out.println("��ϲ�����¶���");
		}else {
			System.out.println("�Բ��𣬲´�����������Ǯ");
		}
	}
}