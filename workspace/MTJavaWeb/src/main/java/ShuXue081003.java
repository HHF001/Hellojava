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
		    // Call method by using method name and arguments通过使用方法名和参数调用方法
		    int smallerNumber = min(3, 10);
		    System.out.println(smallerNumber);            // 输出: 3
		    System.out.println(Math.abs(5));             // abs()方法求绝对值，输出: 5
		    System.out.println(Math.abs(-5));            // Prints: 5
		    System.out.println(Math.abs(-5.0));          //双精度绝对值，输出double类型: 5.0
		    ShuXue081003 myNumbers = new ShuXue081003(2, 5);   //创建一个对象
		    // Call a non-static method on object 必须在对象上调用非静态方法
		    int sum = myNumbers.returnSum();
		    System.out.println(sum);                     //调用加法方法，输出7
		    double x = Math.pow(5, 3);                   //pow()方法返回第一个参数的第二个参数次方的值
		    System.out.println(x);                       // 输出5的3次方: 125.0
		    double ax = Math.sqrt(49);                   //sqrt()方法返回双精度值的正平方根
		    System.out.println(ax);                      // 输出根号49的值: 7.0
		    double y = Math.sqrt(52); 
		    System.out.println(y);                        // Prints: 7.211102550927978
		    System.out.println(Math.random());           //random（）方法随机生成一个大于0.0小于1.0的double值
		    double a = Math.random() * 10;               //随机生成一个0-9之间的一个double值
		    int b = (int)(Math.random() * 10);           //随机生成一个0-9之间的int值
		    int c = (int)(Math.random() * 10) + 1;       //随机生成一个1-10之间的int值
		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(c);
		    int d = (int)(Math.random() * 11 ) + 10;       //（Math.random()*(最大值-最小值+1））+10；输出10-20之间的一个数
		    System.out.println(d);
		  }
}