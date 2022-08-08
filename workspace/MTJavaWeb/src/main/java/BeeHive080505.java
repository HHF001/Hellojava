import java.util.ArrayList;

public class BeeHive080505{
	private ArrayList<Bee080504> beeList;                        //����һ��Bee080504���͵�������ΪbeeList
	
	public BeeHive080505(int numBees) {                         //��һ�������Ͳ����Ĺ��캯��
		this.beeList = new ArrayList<Bee080504>();              //����һ��Bee���͵����鸳ֵ����������
		for(int i = 0; i < numBees;i++) {                       //����С��numBees����ʱ���������³���
			this.beeList.add(new Bee080504("bee" + i));         //��beeList���������һ��Ԫ�ز�������beei��
		}
	}
	
	public void printBees() {                                  //���ÿֻ�۷����ֵķ���
		for(Bee080504 b: this.beeList) {                       //for-eachѭ�����beeList������ÿ��Ԫ��
			System.out.println(b.getName());                   //ÿ�ν���ѭ���͵���getName()������ȡname�����
		}
	}
	
	public ArrayList<Bee080504> getBeeList(){
		return this.beeList;
	}
	
	public void addBees(ArrayList<String> beeNames) {            //������鷽��
		for(String name: beeNames) {                             //����ʵ�������ÿһ��Ԫ��
			this.beeList.add(new Bee080504(name));               //�ѱ���������ÿһ��ʵ������Ԫ����ӵ�������������
		}
	}
	
	public void moveOutBees() {                                //�Ƴ�����
		for(int i = 0; i < this.beeList.size();i++) {          /*û��Ϊʲô�����һ���Ƴ�*/
			this.beeList.remove(i);
		}
	}
	
	public void leaveHome(String beeName) {                    //��������۷������
		for(Bee080504 b: this.beeList) {                       //�۷��������
			if(b.getName().equals(beeName)) {                  //�ж���������ÿ��Ԫ�������Ƿ�����յ���������ͬ������ͬ��ִ�������
				b.leaveHome();                                 //����ͬ���ֵ��۷����뵽leaveHome�����в����ø÷���
			}
		}
	}
	
	public void renameBees(ArrayList<String> newNames) {       //�������ַ���
		int numNamesToAssign = this.beeList.size();            //����һ��������Ϊ���������Ԫ������
		if(newNames.size() < this.beeList.size() ) {           //������������С�ڲ��������������ִ���������
			numNamesToAssign =newNames.size();                 //�������ֵ����������¶����������
		}
		for(int i = 0 ; i < numNamesToAssign;i++) {            //���㿪ʼ����С��������������ѭ��
			this.beeList.get(i).setName(newNames.get(i));      //�ѴӲ��������ȡ�������ָ���Ϊ�����������
		}
	}
	public static void main(String[] args) {                    //main����������������￪ʼ����
		BeeHive080505 myHive = new BeeHive080505(10);           //����һ����ΪmyHive�Ķ���
		//myHive.printBees();
		myHive.leaveHome("bee43");                              //����һ���뿪�ҵ��۷�Ĵ���
		System.out.println(myHive.beeList.get(7).isHome());    //ӡˢ��ĵ�λ����ȷ�����������ڼ�
		System.out.println("-------------------------");
		//BeeHive080505 newHive = new BeeHive080505(3);
		ArrayList<String> newBees = new ArrayList<>();          //�´���һ��String����newBees
		newBees.add("bob");                                     //�½����������Ԫ��
		newBees.add("macy");
		newBees.add("anna");
		myHive.addBees(newBees);                                //������ӵ�������ӵ�myHive������
		for(Bee080504 b: myHive.beeList) {                      //�������myHive�����������ڵ�ÿһ��Ԫ��
			System.out.println(b.getName()); 
		}
		System.out.println("-------------------------");
		/*myHive.moveOutBees();                                   //�����Ƴ�����
		for(Bee080504 b: myHive.beeList) {                      
			System.out.println(b.getName()); 
		}
		System.out.println("-------------------------");*/
		ArrayList<String> newNames = new ArrayList<>();         //����һ��newName������
		newNames.add("one");                                    //�����������Ԫ��
		newNames.add("two"); 
		newNames.add("three");
		newNames.add("four");
		myHive.renameBees(newNames);                            //���ø������ַ���
		for(Bee080504 b: myHive.beeList) {                      //�������myHive�����������ڵ�ÿһ��Ԫ��
			System.out.println(b.getName()); 
		}
		System.out.println("-------------------------");
		
	}
}
