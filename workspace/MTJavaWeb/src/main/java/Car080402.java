 class Car{
	public String color;
	private int speed;
	
	public Car(String color,int speed) {
		this.color = color;
		this.speed = speed;
		/*public void changeTires1() {
		    int numTires = 4;
		    int changedTires = 0;
		    for (int i = 0; i < numTires; i++) {
		      changedTires += 1;
		    }
		    // numTires ��changedTires ���Ա����ʣ�i���У�ֻ��ѭ����ʹ��
		  }*/
		System.out.println("color: "+ color +" speed: "+speed);
	}
	
	public void drive(boolean fourWheel) {
		boolean tires = fourWheel;                  //fourWheel��tiresֻ���ڴ˷����ڲ���ʹ��,��drive������ɺ�fourWheel��tires�ᱻ����
	}
	
	public void piant(String newColor,String newColor2) {
		//newColor��newColorҲ��ֻ���ڸ÷�����ʹ�ã�������ɺ�ᱻ����
	}
}

public class Car080402{
	public static void main(String[] args) {
		Car carObject = new Car("blue",70);        //���õ���public����
		//String carColor = carObject.color;         
		System.out.println(carObject.color);       //color��public�����Է���
		//System.out.println(carObject.speed);    //speed��private˽�з��ʱ��������ܷ���
		System.out.println(carObject);
	}
}