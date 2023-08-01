package Message_ASM2;
class Stack {
    private int top;
    private String[] array;
    public Stack(int capacity) {
        array = new String[capacity];
        top = -1;
    }
    public void push(String item) {
        if (top == array.length - 1) {
            System.out.println("Stack is full. Cannot push more messages.");
            return;
        }
        array[++top] = item;
    }
    public String pop() {
        if (top == -1) {
            System.out.println("Stack is empty. No message to pop.");
            return null;
        }
        String item = array[top];
        top--;
        return item;
    }
    public boolean isEmpty() {
        return top == -1;
    }
}
