import java.util.Scanner;

public class Queue_circular {

    Scanner sc = new Scanner(System.in);
    int n = 10;
    int[] arr = new int[10];
    int front = -1, rear = -1;

    void enqueue() {
        if ((front == 0 && rear == n - 1) || (rear == (front - 1) % (n - 1))) {
            System.out.println("Overflow: Queue is full");
        } else {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else if (rear == n - 1 && front != 0)
                rear = 0;
            else
                rear++;
            System.out.println("Enter Data");
            int data = sc.nextInt();
            arr[rear] = data;
        }
    }

    void dequeue() {
        if (front == -1 || rear == -1)
            System.out.println("Underflow: No data is present");
        else {
            System.out.println("deleted item is: " + arr[front]);
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == n - 1)
                front = 0;
            else
                front++;
        }
    }

    void traverse() {
        int t = front;
        if (t == -1)
            System.out.println("Queue is empty");
        else {
            while (true) {
                System.out.print(arr[t] + " ");
                if (t == n - 1)
                    t = 0;
                else
                    t++;
                if (t == rear) {
                    System.out.println(arr[t]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0;
        // queue q = new queue();
        Queue_circular qq = new Queue_circular();
        do {
            System.out.println("Press: 1 to enqueue data\n Press: 2 to dequeue data\nPress: 3 to traverse");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    qq.enqueue();
                    break;
                case 2:
                    qq.dequeue();
                    break;
                case 3:
                    qq.traverse();
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
