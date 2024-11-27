package queuedemo2;

interface Queue {
    void enqueue(int element);
    int dequeue();
    int peek();
    boolean isFull();
    boolean isEmpty();
    void display(); 
}

class LinearQueue implements Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    LinearQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
        System.out.println("The size of Linear Queue is: " + size);
    }

    @Override
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Linear Queue is full!");
            return;
        }
        if (front == -1) 
            front = 0;
        rear++;
        arr[rear] = element;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Linear Queue is empty!");
            return -1;
        }
        int element = arr[front];
        front++;
        if (front > rear) {
            front = rear = -1;
        }
        return element;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Linear Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    @Override
    public boolean isFull() {
        return rear == size - 1;
    }

    @Override
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Linear Queue is empty.");
            return;
        }
        System.out.print("Linear Queue Elements are: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class CircularQueue implements Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
        System.out.println("The size of Circular Queue is: " + size);
    }

    @Override
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Circular Queue is full!");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size; 
        arr[rear] = element;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty!");
            return -1;
        }
        int element = arr[front];
        if (front == rear) { 
            front = rear = -1; 
        } else {
            front = (front + 1) % size; 
        }
        return element;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    @Override
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    @Override
    public boolean isEmpty() {
        return front == -1; 
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Circular Queue is empty.");
            return;
        }
        System.out.print("Circular Queue Elements are: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size; 
        }
        System.out.println();
    }
}

class QueueDemo2 {
    public static void main(String[] args) {
        
        Queue linearQueue = new LinearQueue(3);
        linearQueue.enqueue(1);
        linearQueue.enqueue(2);
        linearQueue.enqueue(3);
        
        linearQueue.display(); 

        System.out.println("Front element of the Linear Queue is: " + linearQueue.peek());
        
        System.out.println("The front element which is Dequeued: " + linearQueue.dequeue());
        
        linearQueue.display(); 

        System.out.println("Peek element of Linear Queue is: " + linearQueue.peek());
        
      

        
        Queue circularQueue = new CircularQueue(3);
        circularQueue.enqueue(7);
        circularQueue.enqueue(8);
        circularQueue.enqueue(9);
        circularQueue.enqueue(19);
        
        circularQueue.display(); 

        System.out.println("Front element of the Circular Queue is: " + circularQueue.peek());
        
        System.out.println("The front element which is Dequeued: " + circularQueue.dequeue());
        
        circularQueue.display(); 

        System.out.println("Peek element of Circular Queue is: " + circularQueue.peek());
        
       
        circularQueue.display(); 
        
        
       
    }
}
