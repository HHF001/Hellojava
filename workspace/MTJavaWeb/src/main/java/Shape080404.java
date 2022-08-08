class Shape080404{
	int numSides;
	Shape080404(int numSides){                                           //父类构造函数
		this.numSides = numSides;
		System.out.println("I an a shape!");
	}
}

class Triangle extends Shape080404{                         //Triangle类继承Shape类
	Triangle(){                                             //子类构造函数
		super(3);                                           //使用super（）方法调用父类构造函数
		System.out.println("I am a triangle!");
	}
	public static void main(String[] args) {
		Shape080404 sq = new Shape080404(4);
		Triangle tri =new Triangle();
		System.out.println(sq.numSides);                   //输出：4
		System.out.println(tri.numSides);                  //输出：3
	}
}