class Reverse081501{
	      //���ַ����������ַ��������У�forѭ��
	public static String reverseString(String text) {
		String resert = new String("");                   //�½�һ�����ַ���
		for(int i = 0 ;i < text.length();i++) {           //��������ʵ�������ַ�
			char nextCharacter = text.charAt(i);          //�ѱ����������ַ�����һ�����ַ�
			resert = nextCharacter + resert;              //�ѱ����������ַ��������½��Ŀ��ַ���ǰ������µ��ַ���
		}
		return resert;                                    //�������ַ���
	}
	
	       //whileѭ��
	public static String reverseString1(String text) {
		String resert = new String("");
		int i = 0 ;
		while(i < text.length()) {
			char nextCharacter = text.charAt(i);
			resert = nextCharacter + resert;
			i++;
		}
		return resert;
	}
	public static void main(String[] args) {
		String text = new String("abcdefg,fhh,higklmn");
		System.out.println(reverseString1(text));
	}
}