public class Zhishu082402{
	public static void main(String[] args) {
		for(int num=2;num<=100;num++) {           //ѭ����������
			boolean x = false;                    //����ʶ
			for(int i=2;i<=num-1;i++) {           //ѭ����������
				if(num%i == 0) {                  //�ж��ǲ�������
					System.out.println(num+"��������");
					x = true;                     //�޸ı�ʶ
					break;                        //�����ж�if   ������if���ʱ�ж�iѭ��
				}
			}
			if(x == false) {                      //����ʶδ�ı䣬��δִ��ifѭ���������ܱ�����������Ϊ����
				System.out.println(num+"������");
			}
		}
	}
}