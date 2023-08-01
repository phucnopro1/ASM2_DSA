package Message_ASM2;
class Queue {
    private int front, rear, size;
    private String[] array;
    public Queue(int capacity) {
        array = new String[capacity];
        front = rear = 0;
        size = 0;
    }
    public void enqueue(String item) {
        if (size == array.length) {
            System.out.println("Queue is full. Cannot enqueue more messages.");
            return;
        }
        array[rear] = item;
        rear = (rear + 1) % array.length;
        size++;
    }
    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. No message to dequeue.");
            return null;
        }

        String item = array[front];
        front = (front + 1) % array.length;
        size--;
        return item;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
