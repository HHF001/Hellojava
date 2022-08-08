import java.util.ArrayList;                          //引用ArrayList类

class MinHeap{
	public ArrayList<Integer> heap;
	public int size;
	
	public MinHeap() {                               //要被其他类调用，声明为public
		//方法内容
	}
	public void add(int value) {                     //要被其他类调用，声明为public
		heap.add(value);                        
		size++;
		bubbleUp();
	}
	private void bubbleUp() {                        //只需类内调用，声明为private
		//方法内容
	}
}

public class TrackAges080403{
	public static void main(String[] args) {
		MinHeap ages = new MinHeap();
		ages.add(42);
		ages.add(15);
		ages.add(27);
		System.out.println(ages);
	}
}