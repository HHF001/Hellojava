public class Bee080504{
	private String name;                      //����һ��˽���ַ��ͱ���name
	private boolean isHome;                   //����һ��˽�в����ͱ���isHome
	
	public Bee080504(String name) {           //���캯��
		this.name = name;                     //��ʵ��������ֵ������ֵ
		this.isHome = true;                   //ʵ��������ֵ������ֵ
	}
	
	public String getName() {                //�ⲿ���ȡ˽�б���nameֵ�ķ���
		return this.name;
	}
	
	public void setName(String newName) {    //����һ��ʵ��������ֵ������ֵ
		this.name = newName;
	}
	
	public boolean isHome() {               //�ⲿ���ȡ˽�б���isHomeֵ�ķ���
		return this.isHome;
	}
	
	public void leaveHome() {              //��falseֵʵ��������ֵ������ֵ
		this.isHome = false;
	}
	public void returnHome() {              //��trueֵʵ��������ֵ������ֵ
		this.isHome = true;
	}
}