public class Factorial082301 {
	public static int iterativeFactorial(int n) {
		int result = 1;

		while (n > 0) {
			result *= n;                              //计算输入数值的阶乘
			n -= 1;
		}

		return result;
	}
	public static void main(String[] args) {
		// Set int below
    int fourFactorial = iterativeFactorial(4);        //调用方法计算算4！的值
		// Print int below
    System.out.println(fourFactorial);
	}
}