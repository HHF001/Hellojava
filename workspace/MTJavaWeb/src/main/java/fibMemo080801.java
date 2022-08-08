import java.util.HashMap;
import java.util.Map;

public class fibMemo080801{
	
	public static void main (String[] args) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		System.out.println(fibMemo080801(10,map));
		
		map = new HashMap <Integer,Integer>();
		System.out.println(fibMemo080801(20,map));
	}
	
	public static int fibMemo080801(int n, Map<Integer,Integer>map) {
		return n;
	}
}