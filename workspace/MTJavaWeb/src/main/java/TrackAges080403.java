import java.util.ArrayList;                          //����ArrayList��

class MinHeap{
	public ArrayList<Integer> heap;
	public int size;
	
	public MinHeap() {                               //Ҫ����������ã�����Ϊpublic
		//��������
	}
	public void add(int value) {                     //Ҫ����������ã�����Ϊpublic
		heap.add(value);                        
		size++;
		bubbleUp();
	}
	private void bubbleUp() {                        //ֻ�����ڵ��ã�����Ϊprivate
		//��������
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