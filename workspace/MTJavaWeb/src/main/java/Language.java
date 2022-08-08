import java.util.ArrayList;
import java.util.LinkedList;

class Language{
	protected String name;                   
	protected int numSpeakers;
	protected String regionsSpoken;
	protected String wordOrder;
	
	Language(String langName, int speakers, String regions, String wdOrder){                 //���캯��
		this.name = langName;                                       //ʵ��������ֵ������ֵ
		this.numSpeakers = speakers;                                //ʵ��������ֵ������ֵ
		this.regionsSpoken = regions;                               //ʵ��������ֵ������ֵ
		this.wordOrder = wdOrder;                                   //ʵ��������ֵ������ֵ
	}
	public void getInfo() {                                          //�������
		 System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
		 System.out.println("The language follows the word order: " + this.wordOrder);
	}
	public static void main(String[] args) {                        //main��������������￪ʼ����
		Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
		spanish.getInfo();                                          //�����������gerInfo()
		Mayan kiche = new Mayan("Ki'che'", 2330000);
		kiche.getInfo();                                            //������������д���gerInfo()����
		Hanyu mandarin = new Hanyu("Mandarin Chinese",14000000);
		mandarin.getInfo();                                         //���๹�캯������������������������������if���ҲҪ����
		Hanyu burmese = new Hanyu("Burmese",430000);
		burmese.getInfo();                                          //���๹�캯��������������������
		
		            //ArrayList��ط�����Ӧ��
		ArrayList<String> months = new ArrayList<String>(12);      //����һ������Ϊ12�������б�
		months.add("һ��");                                         //add�����������Ԫ�ء�һ�¡�
		months.add("����");
		months.add("����");
		System.out.println(months);                                //�����һ�� ���� ���¡�
		months.add(2,"March");                                     //�ڵ�����Ԫ��λ�����һ����March��Ԫ�أ�����Ԫ�ؾ�����һλ
		System.out.println(months);                                //�����һ�� ���� March ���¡�
		System.out.println(months.get(1));                         //��������еĵڶ���Ԫ�ء����¡�
		months.remove(3);                                         //�Ƴ������еĵ��ĸ�Ԫ�ء����¡�
		System.out.println(months);                                //�����һ�� ���� March��
		              
		            //LinkedList��ط�����Ӧ��
		LinkedList<String> days = new LinkedList<String>();        //����һ��û�д�С���Ƶ�����
		days.add("Monday");                                        //���������һ��Ԫ��
		days.add("Tuesday");
		System.out.println(days);                                  //�������Ԫ��[Monday Tuesday]
		days.add(0,"Sunday");                                      //�������һ��λ�����Ԫ�أ���������Ԫ�غ���һλ
		System.out.println(days);                                  //�������Ԫ��[Sunday Monday Tuesday]
		System.out.println(days.get(1));                           //��ȡ�������ڶ���Ԫ�� Monday
		days.remove(1);                                            //�Ƴ�����ڶ���Ԫ��
		System.out.println(days);                                  //�������Ԫ��[Sunday Tuesday]
		days.remove();                                             //�Ƴ�����ͷ������һ����Ԫ�� sunday
		System.out.println(days);                                  //�������Ԫ��[Tuesday]
	}
}