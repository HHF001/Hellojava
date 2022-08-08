class Bird080406{
	public Bird080406(){
		//方法主体
	}
	public void move() {                                     //父类move方法
		System.out.println("The bird flies away");
	}
}

class Penguin extends Bird080406{
	public Penguin() {
		//方法主体
	}
	
	@Override                                               //重写方法关键字
	public void move() {                                    //重写move()方法
		System.out.println("the penguin is flies away");
	}
	
	public static void main(String[] args) {
		Penguin myPenguin = new Penguin();
		myPenguin.move();                                 //将调用子类重写后的move（）方法
	}
}