//import java.util.Scanner;

public class Dna081802{
	public static void main(String[] args) {
		//��������DNA
		String dna1 = "ATGCGATACGCTTGA";
		String dna2 = "ATGCGATACGTGA";
		String dna3 = "ATTAATATGTACTGA";
		//�趨һ����ѯ��DNA
		String dna = dna2;
		//ȷ����ѯDNA������������
		int length = dna.length();
		System.out.println("length: "+length);
		//�����ʵ����Զ���
		int start = dna.indexOf("ATG");
		int end   = dna.indexOf("TGA");
		System.out.println(start);
     	System.out.println(end);
     	//���ݵ��������Բ���DNA���Ƿ��е����ʵ�����
     	if(start != -1 && end != -1 && (end - start) % 3 == 0) {
     		String protein = dna.substring(start,end+3);           //DNA����ƴ��
     		System.out.println("������protein��"+protein);
     	}else {
     		System.out.println("����������");
     	}
	}
}