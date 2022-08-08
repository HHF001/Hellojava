public class Cat080203{
	String noise;
	int numLives = 9 ;
	/*public Cat080203(String noise) {      //参数与实例变量的名字相同
		this.noise = noise;               //将实例变量赋值给参数值
	}*/
	/*public void speak() {                            //非静态方法
		System.out.println(noise);                 
	}*/
	 public String toString() {
		    //System.out.println("The cat with " + numLives + " lives says " + noise);
		    return "The cat with " + numLives + " lives says " + noise;
		  }
	public Cat080203(String animalNoise) {           //构造函数接受一个String类型参数
		noise = animalNoise;                          //将实例变量赋值给参数值
	}
	public static void main(String[] args) {
		Cat080203 myCat = new Cat080203("mew");       //创建一个对象并发送参数给构造函数
		//myCat.speak();                                //在对象上调用非静态方法，输出：mew
		System.out.println(myCat);                    
		
	}
}