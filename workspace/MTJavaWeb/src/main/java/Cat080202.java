public class Cat080202{
	//String noise = "meow" ;                       //定义一个字符类型noise并赋值为meow
	String noise ;                                  //定义一个String类型的noise字符
 	int numLives = 9;                               //定义一个整数类型numLives并赋值为9
	public Cat080202(String animalNoise) {          //构造函数接受一个String类型的参数
		noise = animalNoise;                        //将实例变量赋值给参数值
	}
	public static void main(String[] args) {        
		//Cat080202 myCat = new Cat080202();     //创建一个Cat类并命名为myCat
		//System.out.println(myCat.noise);       //访问对象的实例变量,输出 meow
		Cat080202 firstCat = new Cat080202("mew");     //创建一个对象并发送参数给构造函数
		Cat080202 secondCat = new Cat080202("mow");    //创建另一个对象，并也将一个参数发送给构造函数
		System.out.println(firstCat.noise);                  //输出：mew
		System.out.println(secondCat);                       //输出内存地址
	}
}