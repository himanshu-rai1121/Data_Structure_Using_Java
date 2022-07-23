import java.util.*;

public class Stack_parenthesis_check {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node top = null;

    void push(char c) {
        Node new_node = new Node(c);
        new_node.next = top;
        top = new_node;
    }

    void pop() {
        top = top.next;
    }

    void check(String st, int len) {
        char c = '(';
        for (int i = 0; i < len; i++) {
            if (st.charAt(i) == '(')
                push(c);
            else if (st.charAt(i) == ')' && top.data == '(')
                pop();
            else if (st.charAt(i) == ')') {
                System.out.println("Not Balanced");
                break;
            }
        }

        if (top == null)
            System.out.println("Balanced Paranthesis");
        else
            System.out.println("Not Balanced");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        Stack_parenthesis_check s = new Stack_parenthesis_check();
        int len = st.length();
        s.check(st, len);
    }
}
