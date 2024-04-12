package Queue;

public class IntQueue {
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	public IntQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
		front = rear = size = 0;	
	}

	
	public boolean enqueue(int data) {
		if (isFull()) return false;
		
		queue[rear++] = data;
		if (rear == capacity) rear = 0;
		size++;
		
		return true;
	}
	
	public int dequeue() {
		if (isEmpty()) return -1;
		
		int result = queue[front++];
		if (front == capacity) front = 0;
		size--;
		
		return result;
	}
	
	public int getFront() {
		if (isEmpty()) return -1;
		return queue[front];
	}
	
	public int getSize() {
		return size;
	}
	
	public void clear() {
		size = front = rear = 0;
	}
	
	public void dump() {
		if (isEmpty()) { 
			System.out.println("Queue가 비어 있습니다.");
		}
		// front <  rear
		else if (front < rear) {
			for (int i = front; i < rear; i++) {
				System.out.print(queue[i] + " ");
			}
			System.out.println();
		}
		// front >= rear
		else {
			/* for (int i = front; i < capacity; i++) {
				System.out.print(queue[i] + " ");
			}
			for (int i = 0; i < rear; i++) {
				System.out.print(queue[i] + " ");
			}
			System.out.println();
			*/
			
			for (int i = 0; i < size; i++) {
				System.out.print(queue[i + front] % capacity);
			}
			System.out.println();	
			
		}
	
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}

	public void peak() {
		System.out.println(queue[rear - 1]);
	}
	
	
	public int[] getQueue() {
		return queue;
	}


	public void setQueue(int[] queue) {
		this.queue = queue;
	}


	public int getRear() {
		return rear;
	}


	public void setRear(int rear) {
		this.rear = rear;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public void setFront(int front) {
		this.front = front;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	
}
