public class Cat80202{
	String noise ;             // 创建一个字符串noise
	int numLives = 9;          //创建一个整数numLives并赋值为9
	public Cat80202(String animalNoise) {
		noise = animalNoise;
	}
	public static void main(String[] args) {
		Cat80202 firstCat = new Cat80202("mew");       //定义一个firstCat并赋值为“new"
		Cat80202 secondCat = new Cat80202("mow");      //定义一个firstCat并赋值为“now"
		System.out.println(firstCat.noise);            //实例变量firstCat调用
		System.out.println(secondCat.noise);
	}
}