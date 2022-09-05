package Java0024CollectionListAndHashes;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();  
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("Head:" + queue.element());  
		System.out.println("Head:" + queue.peek());  
		System.out.println("Iterating the queue elements : ");  

		@SuppressWarnings("rawtypes")
		Iterator itr=queue.iterator();  
		while(itr.hasNext()) {  
			System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("After removing two elements : ");  

		Iterator<String> itr2 = queue.iterator();  
		while(itr2.hasNext()) {  
			System.out.println(itr2.next());  
		}
	}
}