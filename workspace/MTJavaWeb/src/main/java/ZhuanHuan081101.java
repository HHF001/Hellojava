public class ZhuanHuan081101{
	public static void main(String[] args) {
		double numDouble = 12.99;
		System.out.println("Double value: " + numDouble);    //���12.99
		      //  ǿ��ת��Ϊint���ͣ�������������
		int numInt = (int) numDouble;
		System.out.println("Int value: " + numInt);          //���12
		      //   ��Ҫ�������뵽�����������ʹ��value+0.5
		int nuInt = (int) (numDouble + 0.5);
		System.out.println("Int value: " + nuInt);           //���13
		System.out.println("Min: " + Integer.MIN_VALUE);     //���int������Сֵ Prints: Min: -2147483648
		System.out.println("Max: " + Integer.MAX_VALUE);     // ���int�������ֵPrints: Max: 2147483647
		int mInt = 9;
		System.out.println("Int value: " + mInt);            //�����9
		      // int����ת��Ϊdouble����
		System.out.println("Double value: " + (double)mInt);  //�����9.0
		System.out.println(100.0 / 5);                       // double���Զ�����Ϊdouble��Prints: 20.0
		System.out.println((double)(100 / 5));               //int����ǿ��ת����double�� Prints: 20.0
		System.out.println("\n--------------------------"); 
		int numIn = 15;
		System.out.println("Int value: " + numIn);            //�����15
		     //  int��ת��ΪString��
		String numString = String.valueOf(numIn);
		System.out.println("String value: " + numString);     //�����15����Ȼ����15�������15��string���͵�
		String numStrin = "12";
		//  String ����ת��Ϊint���ͣ�ʹ��.parseInt��������
		int numI = Integer.parseInt(numStrin);
		System.out.println("The int value: " + numI);          //���int����: 12
		// ���ڿ�����ʹ�����int���ͽ�����������
		 numI++;
		System.out.println(numInt);                            // Prints: 13
		 
	}
}