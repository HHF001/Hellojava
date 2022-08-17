import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class SeasonDemo081702{
	public static void main(String[] args) {
		//创建一个month变量，用来储存一个月份值（Scanner)
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个月份，我来帮你判断所属的季节"); 
		int month = input.nextInt();                              //读取输入数字  input。nextLine()读取字符	
		
		//通过month储存的值，进行季节的判断                                        优化方案
		if(month == 3 || month == 4 || month ==5) {               //else if(month >= 3 && month <= 5){}
			System.out.println("春天");
		}else if(month == 6 || month == 7 || month ==8) {         //else if(month >= 6 && month <= 8){}
			System.out.println("夏天");
		}else if(month == 9 || month == 10 || month ==11) {        //else if(month >= 9 && month <= 115){}
			System.out.println("秋天");
		}else if(month == 12 || month == 1 || month ==2) {         //else{}
			System.out.println("冬天");
		}else {                                                    //if (month < 1|| month>12){}
			System.out.println("您输入的数字不符合月份，数据有误");
		}
	}
}