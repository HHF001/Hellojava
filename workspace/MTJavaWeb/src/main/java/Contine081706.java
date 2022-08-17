import java.util.Scanner;

public class Contine081706 {
	public static void main(String[] args) {
     // 获得一个输入的数字
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您想查询的是第几大城市");
		int contient = input.nextInt();
		
    switch(contient){
      case 1:
      System.out.println("North America: Mexico City, Mexico");
      break;
      case 2:
      System.out.println("North America: Mexico City, Mexico");
      break;
      case 3:
      System.out.println("Europe: Moscow, Russia");
      break;
      case 4:
      System.out.println("Africa: Lagos, Nigeria");
      break;
      case 5:
      System.out.println("Asia: Shanghai, China");
      break;
      case 6:
      System.out.println("Antarctica: McMurdo Station, US");
      break;
      case 7:
      System.out.println("Antarctica: McMurdo Station, US");
      break;
      default:
      System.out.println("Undefined continent!");
      }
    }
	}