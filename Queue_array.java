import java.util.Scanner;

class queue {

    Scanner sc = new Scanner(System.in);
    int n = 10;
    int[] arr = new int[10];
    int front = -1, rear = -1;

    void engueue() {
        if (rear == n - 1)
            System.out.println("overflow: No data can be inserted to queue");
        else {
            System.out.println("Enter the number of element to be Inserted");
            int num = sc.nextInt();
            if (num > (n - 1) - rear)
                System.out.println("The number of inserted data should be less then or equal to: " + (n - 1 - rear));
            else {
                System.out.println("Enter Data");
                // front++;
                for (int i = 0; i < num; i++) {
                    if (front == -1 && rear == -1) {
                        front = 0;
                        rear = 0;
                    } else
                        rear++;
                    int data = sc.nextInt();
                    arr[rear] = data;
                }
            }
        }
    }

    void dequeue() {
        if (rear == -1)
            System.out.println("Underflow: No data is present");
        else if (front == rear + 1)
            System.out.println("Underflow: No data is present");
        else {
            System.out.println("Removed data is: " + arr[front]);
            front++;
        }
    }

    void traverse() {
        System.out.print("The data in queue is: ");
        for (int i = front; i <= rear; i++)
            System.out.print(arr[i]);
        System.out.println();
    }
}

public class Queue_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0;
        queue q = new queue();
        do {
            System.out.println("Press: 1 to enqueue data\n Press: 2 to dequeue data\nPress: 3 to traverse");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    q.engueue();
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.traverse();
                    break;
                default:
                    System.out.println("Wrong input");
            }
            System.out.println("press 1 to repeat else press any key to exit:-");
            p = sc.nextInt();
        } while (p == 1);
        sc.close();
    }
}