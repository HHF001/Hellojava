//import java.util.Scanner;

public class Dna081802{
	public static void main(String[] args) {
		//定义三种DNA
		String dna1 = "ATGCGATACGCTTGA";
		String dna2 = "ATGCGATACGTGA";
		String dna3 = "ATTAATATGTACTGA";
		//设定一个查询的DNA
		String dna = dna2;
		//确定查询DNA的密码子数量
		int length = dna.length();
		System.out.println("length: "+length);
		//蛋白质的特性定义
		int start = dna.indexOf("ATG");
		int end   = dna.indexOf("TGA");
		System.out.println(start);
     	System.out.println(end);
     	//根据蛋白质特性查找DNA中是否有蛋白质的序列
     	if(start != -1 && end != -1 && (end - start) % 3 == 0) {
     		String protein = dna.substring(start,end+3);           //DNA序列拼接
     		System.out.println("蛋白质protein："+protein);
     	}else {
     		System.out.println("不含蛋白质");
     	}
	}
}