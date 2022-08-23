public class Factorial082302 {
	/*public static int recursiveFactorial(int n) {
		if (n > 0) {                                               //如果输入的数大于0，计算其阶乘
			System.out.println("Execution context: " + n);

			return n * recursiveFactorial(n - 1);
		}else{                                                   //如果小于或定于0.返回1
      return 1;
    }

		
	}

	public static void main(String[] args) {
		int recursiveSolution = recursiveFactorial(4);    //调用方法计算4的阶乘
		System.out.println(recursiveSolution);
	}*/
	                  //两种方法算阶乘
	public static int recursiveFactorial(int n) {
		if (n > 0) {
			return n * recursiveFactorial(n - 1);
		} else {
			return 1;
		}
	}

	public static int iterativeFactorial(int n) {
		int result = 1;

		while (n > 0) {
			result *= n;
			n -= 1;
		}

		return result;
	}

	public static void main(String[] args) {
		int recursiveSolution = recursiveFactorial(10);
		System.out.println("The recursive solution to 10! is: " + recursiveSolution);

		int iterativeSolution = iterativeFactorial(10);
		System.out.println("The iterative solution to 10! is: " + iterativeSolution);
	}
}