package test;
import java.util.PriorityQueue;
public class Demo {
	public static void main(String args[])
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(54);
		pq.offer(82);
		pq.offer(74);
		pq.offer(71);
		pq.offer(55);
		pq.offer(43);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}
