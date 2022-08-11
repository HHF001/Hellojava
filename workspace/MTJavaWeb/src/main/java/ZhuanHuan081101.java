public class ZhuanHuan081101{
	public static void main(String[] args) {
		double numDouble = 12.99;
		System.out.println("Double value: " + numDouble);    //输出12.99
		      //  强制转换为int类型，不会四舍五入
		int numInt = (int) numDouble;
		System.out.println("Int value: " + numInt);          //输出12
		      //   若要四舍五入到最近的整数，使用value+0.5
		int nuInt = (int) (numDouble + 0.5);
		System.out.println("Int value: " + nuInt);           //输出13
		System.out.println("Min: " + Integer.MIN_VALUE);     //输出int类型最小值 Prints: Min: -2147483648
		System.out.println("Max: " + Integer.MAX_VALUE);     // 输出int类型最大值Prints: Max: 2147483647
		int mInt = 9;
		System.out.println("Int value: " + mInt);            //输出：9
		      // int类型转换为double类型
		System.out.println("Double value: " + (double)mInt);  //输出：9.0
		System.out.println(100.0 / 5);                       // double类自动保存为double类Prints: 20.0
		System.out.println((double)(100 / 5));               //int类需强制转换成double类 Prints: 20.0
		System.out.println("\n--------------------------"); 
		int numIn = 15;
		System.out.println("Int value: " + numIn);            //输出：15
		     //  int类转换为String类
		String numString = String.valueOf(numIn);
		System.out.println("String value: " + numString);     //输出：15，虽然都是15，但这个15是string类型的
		String numStrin = "12";
		//  String 类型转换为int类型，使用.parseInt（）方法
		int numI = Integer.parseInt(numStrin);
		System.out.println("The int value: " + numI);          //输出int类型: 12
		// 现在可随意使用这个int类型进行其他操作
		 numI++;
		System.out.println(numInt);                            // Prints: 13
		 
	}
}