import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class SeasonDemo081702{
	public static void main(String[] args) {
		//����һ��month��������������һ���·�ֵ��Scanner)
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���·ݣ����������ж������ļ���"); 
		int month = input.nextInt();                              //��ȡ��������  input��nextLine()��ȡ�ַ�	
		
		//ͨ��month�����ֵ�����м��ڵ��ж�                                        �Ż�����
		if(month == 3 || month == 4 || month ==5) {               //else if(month >= 3 && month <= 5){}
			System.out.println("����");
		}else if(month == 6 || month == 7 || month ==8) {         //else if(month >= 6 && month <= 8){}
			System.out.println("����");
		}else if(month == 9 || month == 10 || month ==11) {        //else if(month >= 9 && month <= 115){}
			System.out.println("����");
		}else if(month == 12 || month == 1 || month ==2) {         //else{}
			System.out.println("����");
		}else {                                                    //if (month < 1|| month>12){}
			System.out.println("����������ֲ������·ݣ���������");
		}
	}
}