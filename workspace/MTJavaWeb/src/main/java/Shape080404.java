class Shape080404{
	int numSides;
	Shape080404(int numSides){                                           //���๹�캯��
		this.numSides = numSides;
		System.out.println("I an a shape!");
	}
}

class Triangle extends Shape080404{                         //Triangle��̳�Shape��
	Triangle(){                                             //���๹�캯��
		super(3);                                           //ʹ��super�����������ø��๹�캯��
		System.out.println("I am a triangle!");
	}
	public static void main(String[] args) {
		Shape080404 sq = new Shape080404(4);
		Triangle tri =new Triangle();
		System.out.println(sq.numSides);                   //�����4
		System.out.println(tri.numSides);                  //�����3
	}
}