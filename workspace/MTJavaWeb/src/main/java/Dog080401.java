public class Dog080401{
	private String name;
	
	public Dog080401(String name) {
		this.name = name;                          //��ʵ��������ֵ������ֵ
	}
	
	public String getName() {                     //���������������ʱ����е�˽��ʵ������
		return name;
	}
	
	public void setName(String newName) {         //ͨ����void���ط������������κζ�����ֻ���������б�����ֵ
		name =newName;                            //��ʵ��������ֵ������ֵ
	}
	
	public static void main(String[] args) {
		Dog080401 myDog = new Dog080401("Cujo");
		System.out.println(myDog.getName());    //���coji
		System.out.println(myDog);
		myDog.setName("Lassie");                //����set������ֵ
		System.out.println(myDog.getName());    //���Lassie
		System.out.println(myDog);              //����ڴ��ַ
	}
}