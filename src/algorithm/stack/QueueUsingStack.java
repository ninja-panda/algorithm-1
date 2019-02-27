package algorithm.stack;

import java.util.Stack;

public class QueueUsingStack {

	private Stack<Object> enQueueStack = new Stack<>();
	private Stack<Object> deQueueStack = new Stack<>();

	public void enQueue(Object data) {
		enQueueStack.push(data);
	}

	public Object deQueue() {
		Object item = null;
		if (!deQueueStack.isEmpty()) {
			item = deQueueStack.pop();
		} else {
			while (!enQueueStack.isEmpty()) {
				deQueueStack.push(enQueueStack.pop());
			}
			item = deQueueStack.pop();
		}
		return item;
	}
	
	public static void main(String[] args){
		QueueUsingStack queueUsingStack = new QueueUsingStack();
		
		queueUsingStack.enQueue("ARPAN");
		queueUsingStack.enQueue("DAS");
		queueUsingStack.enQueue("JAVA");
		
		System.out.println(queueUsingStack.deQueue());
		System.out.println(queueUsingStack.deQueue());
		System.out.println(queueUsingStack.deQueue());
	}
	
	
}


