package June_2.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueThirdEx {

	public static void main(String[] args) {
		//PriorityQueue<Object> pq = new PriorityQueue();// priorityQueue
		Queue pq  = new LinkedList();
		pq.add("java");
		pq.add("siva");
		pq.add("ravi");
		//pq.add("AWS");
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.contains("Aws"));
		while(pq.peek()!= null) {
			System.out.println(pq.poll());
		}
		System.out.println("after while loop : "+pq);
	}

}
