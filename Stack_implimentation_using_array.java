import java.util.Scanner;

class stack {
    int n = 10;
    int[] arr = new int[n];
    int top = -1;

    Scanner sc = new Scanner(System.in);

    void push() {
        if (top == n - 1)
            System.out.println("Overflow");

        else {
            System.out.println("Enter data");
            int data = sc.nextInt();
            top = top + 1;
            arr[top] = data;
        }
    }

    void pop() {
        if (top == -1)
            System.out.println("Underflow");

        else {
            top = top - 1;
            System.out.println("Item deleated");
        }
    }

    void traverse() {
        for (int i = 0; i <= top; i++)
            System.out.print(arr[i] + " ");

        System.out.println("");
    }
}

public class Stack_implimentation_using_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        int p = 0;
        do {
            System.out.println("Press: 1 to push data\n Press: 2 to pop data\nPress: 3 to traverse");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.traverse();
                    break;
                default:
                    System.out.println("Wrong input");
            }
            System.out.println("press 1 to repeat else press any key to exit:-");
            p = sc.nextInt();
        } while (p == 1);

    }
}
