public class Cat80202{
	String noise ;             // ����һ���ַ���noise
	int numLives = 9;          //����һ������numLives����ֵΪ9
	public Cat80202(String animalNoise) {
		noise = animalNoise;
	}
	public static void main(String[] args) {
		Cat80202 firstCat = new Cat80202("mew");       //����һ��firstCat����ֵΪ��new"
		Cat80202 secondCat = new Cat80202("mow");      //����һ��firstCat����ֵΪ��now"
		System.out.println(firstCat.noise);            //ʵ������firstCat����
		System.out.println(secondCat.noise);
	}
}