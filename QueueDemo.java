interface Queue {
    void enqueue(int item);
    int dequeue();
    int peek();
    boolean isEmpty();
    boolean isFull();
    void display();
    int size();
}

class LinearArrayQueue implements Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    LinearArrayQueue(int size) {
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    @Override
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add " + item);
            return;
        }
        rear++;
        queue[rear] = item;
        count++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int item = queue[front];
        front++;
        count--;
        System.out.println("Dequeued element: " + item);
        return item;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean isFull() {
        return rear == capacity - 1;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        LinearArrayQueue queue = new LinearArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();       

        
        
        queue.dequeue();      

        System.out.println("The front element is: " + queue.peek());
        queue.display();   
    }
}
