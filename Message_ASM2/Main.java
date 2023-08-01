package Message_ASM2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue messageQueue = new Queue(100); // Assume a capacity of 100 messages
        Stack messageStack = new Stack(100);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Message");
            System.out.println("2. Send Message");
            System.out.println("3. View Sent Messages");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left by nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter the message (less than 250 characters): ");
                    String message = scanner.nextLine();

                    while (message.isEmpty() || message.length() >= 250) {
                        if (message.isEmpty()) {
                            System.out.println("Message cannot be empty. Try again.");
                        } else {
                            System.out.println("Message should be less than 250 characters. Try again.");
                        }
                        System.out.print("Enter the message (less than 250 characters): ");
                        message = scanner.nextLine();
                    }

                    messageQueue.enqueue(message);
                    break;

                case 2:
                    System.out.println("\nSending messages...");
                    while (!messageQueue.isEmpty()) {
                        String msg = messageQueue.dequeue();
                        messageStack.push(msg);
                        System.out.println("Sending: " + msg);
                    }
                    break;

                case 3:
                    if (messageStack.isEmpty()) {
                        System.out.println("No messages sent yet.");
                    } else {
                        System.out.println("\nSent Messages:");
                        while (!messageStack.isEmpty()) {
                            String msg = messageStack.pop();
                            System.out.println("Sent: " + msg);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option (1/2/3/4).");
                    break;
            }
        }
    }
}