class Bird080406{
	public Bird080406(){
		//��������
	}
	public void move() {                                     //����move����
		System.out.println("The bird flies away");
	}
}

class Penguin extends Bird080406{
	public Penguin() {
		//��������
	}
	
	@Override                                               //��д�����ؼ���
	public void move() {                                    //��дmove()����
		System.out.println("the penguin is flies away");
	}
	
	public static void main(String[] args) {
		Penguin myPenguin = new Penguin();
		myPenguin.move();                                 //������������д���move��������
	}
}