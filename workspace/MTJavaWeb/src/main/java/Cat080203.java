public class Cat080203{
	String noise;
	int numLives = 9 ;
	/*public Cat080203(String noise) {      //������ʵ��������������ͬ
		this.noise = noise;               //��ʵ��������ֵ������ֵ
	}*/
	/*public void speak() {                            //�Ǿ�̬����
		System.out.println(noise);                 
	}*/
	 public String toString() {
		    //System.out.println("The cat with " + numLives + " lives says " + noise);
		    return "The cat with " + numLives + " lives says " + noise;
		  }
	public Cat080203(String animalNoise) {           //���캯������һ��String���Ͳ���
		noise = animalNoise;                          //��ʵ��������ֵ������ֵ
	}
	public static void main(String[] args) {
		Cat080203 myCat = new Cat080203("mew");       //����һ�����󲢷��Ͳ��������캯��
		//myCat.speak();                                //�ڶ����ϵ��÷Ǿ�̬�����������mew
		System.out.println(myCat);                    
		
	}
}