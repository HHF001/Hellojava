import static java.lang.Math.*;
public class ShuXue081003{
	int firstNumber;
	  int secondNumber;
	 
	  public  ShuXue081003 (int num1, int num2) {
	    firstNumber = num1;
	    secondNumber = num2;
	  }
	 
	  // non-static method
	  public int returnSum() {
	    return firstNumber + secondNumber;
	  }
	 public static void main(String[] args) {
		    // Call method by using method name and argumentsͨ��ʹ�÷������Ͳ������÷���
		    int smallerNumber = min(3, 10);
		    System.out.println(smallerNumber);            // ���: 3
		    System.out.println(Math.abs(5));             // abs()���������ֵ�����: 5
		    System.out.println(Math.abs(-5));            // Prints: 5
		    System.out.println(Math.abs(-5.0));          //˫���Ⱦ���ֵ�����double����: 5.0
		    ShuXue081003 myNumbers = new ShuXue081003(2, 5);   //����һ������
		    // Call a non-static method on object �����ڶ����ϵ��÷Ǿ�̬����
		    int sum = myNumbers.returnSum();
		    System.out.println(sum);                     //���üӷ����������7
		    double x = Math.pow(5, 3);                   //pow()�������ص�һ�������ĵڶ��������η���ֵ
		    System.out.println(x);                       // ���5��3�η�: 125.0
		    double ax = Math.sqrt(49);                   //sqrt()��������˫����ֵ����ƽ����
		    System.out.println(ax);                      // �������49��ֵ: 7.0
		    double y = Math.sqrt(52); 
		    System.out.println(y);                        // Prints: 7.211102550927978
		    System.out.println(Math.random());           //random���������������һ������0.0С��1.0��doubleֵ
		    double a = Math.random() * 10;               //�������һ��0-9֮���һ��doubleֵ
		    int b = (int)(Math.random() * 10);           //�������һ��0-9֮���intֵ
		    int c = (int)(Math.random() * 10) + 1;       //�������һ��1-10֮���intֵ
		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(c);
		    int d = (int)(Math.random() * 11 ) + 10;       //��Math.random()*(���ֵ-��Сֵ+1����+10�����10-20֮���һ����
		    System.out.println(d);
		  }
}