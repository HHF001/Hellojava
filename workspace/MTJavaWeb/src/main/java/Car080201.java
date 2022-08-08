public class Car080201{              //定义类
	public Car080201(){              //构造方法
		System.out.println("正在学习中");         //只要调用该方法，就输出“正在学习中”
	} 
	public static void main(String[] args) {  //main主函数，程序从这里开始运行
		Car080201 ferrari = new Car080201();  //调用构造函数
		System.out.println(ferrari);          //变量被声明的为引用型数据类型，意味着是对实例内存地址的引用，所以输出内存地址
	}
}