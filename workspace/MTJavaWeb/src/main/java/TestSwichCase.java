public class TestSwichCase {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade)
		{
		case 'A':
			System.out.println("����");
			break;
		case 'B':
		case 'C':
			System.out.println("����");
			break;
		case 'D':
			System.out.println("����");
			break;
		default:
			System.out.println("δ֪�ȼ�");
		}
		System.out.println("�ȼ���" + grade);
	}
}