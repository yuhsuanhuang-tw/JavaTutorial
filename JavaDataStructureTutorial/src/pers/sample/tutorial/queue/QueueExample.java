/**
 * 
 * @author Yu-Hsuan Huang
 * 
 * You should understand linked list first.
 * 
 * Queue: A queue is a linear data structure in which 
 * 	elements can be inserted only from one side of the list called rear, 
 * 	and the elements can be deleted only from the other side called the front.
 * 
 * The queue data structure follows the FIFO (First In First Out) principle
 * 
 * Applications:
 * 	1. Serving requests, like a printer, CPU task scheduling
 * 	2. Call Center phone systems uses Queues to hold people calling them in an order
 * 	3. Multiprogramming
 * 	4. Asynchronous data transfer (file IO, pipes, sockets)
 * 
 */
package pers.sample.tutorial.queue;

import java.util.LinkedList;

public class QueueExample {
	
	public static void main(String[] args) {
		
		//Queue
		LinkedList<String> queue = new LinkedList<String>();
		
		//enqueue
		//add() - Appends the specified element to the end of this list.
		queue.add("Winnie");
		queue.add("Lai");
		queue.add("Yu-Hsuan Huang");
		
		//dequeue
		//remove() - Retrieves and removes the head (first element) of this list.
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
	}

}
