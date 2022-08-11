public class YunSuan081104{
	
	public static void main(String[] args) {
		int z = 1;
		int q = z++;
		System.out.println(z);
		System.out.println(q);
		System.out.println("-------------------");
		int z1 = 1;
		int q1 = ++z1;
		System.out.println(z1);
		System.out.println(q1);
		System.out.println("-------------------");
		int c = 1;
		c = c++;
		System.out.println(c);
		System.out.println("-------------------");
		int c1 = 1;
		c1 = ++c1;
		System.out.println(c1);
		System.out.println("-------------------");
		int a = 1;
		for(int i = 1;i<100;i++) {
			a = a++;                                 //无论循环多少次。a不变
		}
		System.out.println(a);
	}
}