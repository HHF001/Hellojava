public class Cat080202{
	//String noise = "meow" ;                       //����һ���ַ�����noise����ֵΪmeow
	String noise ;                                  //����һ��String���͵�noise�ַ�
 	int numLives = 9;                               //����һ����������numLives����ֵΪ9
	public Cat080202(String animalNoise) {          //���캯������һ��String���͵Ĳ���
		noise = animalNoise;                        //��ʵ��������ֵ������ֵ
	}
	public static void main(String[] args) {        
		//Cat080202 myCat = new Cat080202();     //����һ��Cat�ಢ����ΪmyCat
		//System.out.println(myCat.noise);       //���ʶ����ʵ������,��� meow
		Cat080202 firstCat = new Cat080202("mew");     //����һ�����󲢷��Ͳ��������캯��
		Cat080202 secondCat = new Cat080202("mow");    //������һ�����󣬲�Ҳ��һ���������͸����캯��
		System.out.println(firstCat.noise);                  //�����mew
		System.out.println(secondCat);                       //����ڴ��ַ
	}
}