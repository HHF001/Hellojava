public class Test003 {
    // ����������Ĵ���
    public void prit1(float c) {
        float p = c / 2;// ��������
        float d;// ������������
        float e;// ������ӡ*�ŵı���
        float f;// ������ӡ�ո�ı���
        float r;// ������������
        float s = c % 2;// ȡģ
        if (s == 0) {
            System.out.println("����������ݲ����γ����νṹ");
        } else {
            for (d = 1; d <= p; d++) {
                for (f = p; f >= d; f--) {
                    System.out.print(" ");
                }
                for (e = 1; e <= d * 2 - 1; e++) {
                    if (e == 1 || e == d * 2 - 1) {
                        System.out.print("*");// ����ǵ�һ���������һ������������*
                    } else {
                        System.out.print(" ");// ��������ո�
                    }
                }
                System.out.println();
            }
        }
    }

    // �����Ǵ�ӡ����Ĵ���
    public void prit2(float m) {
        float i;// ������������
        float j;// ������ӡ*�ŵı���
        float k;// ������ӡ�ո����ı���
        float n = m / 2 + 1;// ��������
        float o = m % 2;// mȡģ
        if (o == 0) {
            System.out.print("");
        } else {
            for (i = 1; i <= n; i++)// ����ѭ����
            {
                // ��ӡ*��ǰ��ӡ�ո�
                for (k = 0; k < i - 1; k++) {
                    System.out.print(" ");
                }

                // �����ӡ*�Ÿ�����ѭ����
                for (j = (n - k) * 2 - 2; j >= 1; j--)// ��ӡ*�Ÿ�����ѭ����
                {
                    if (j == (n - k) * 2 - 2 || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // ��ӡ��*�Ż��д�ӡ��
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Test003 a = new Test003();
        float b = 11;// �����������ж��Ƿ����������Ρ�����ǻ����п��������Ӧ�����Σ������ż���������"����������ݲ����γ����νṹ";
        a.prit1(b);
        a.prit2(b);
    }
}