import java.util.Scanner;

public class Binary_tree_creation_trversal {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node create() {

        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.println("Enter Data");
        int data = sc.nextInt();

        if (data == -1)
            return null;
        root = new Node(data);
        System.out.println("Enter left child of " + root.data);
        root.left = create();
        System.out.println("Enter right child of " + root.data);
        root.right = create();
        return root;
    }

    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        // Node root = create();
        Node root = create();
        System.out.print("Inorder Traversal : ");
        inorder(root);
        System.out.println();
        System.out.print("Preorder Traversal : ");
        preorder(root);
        System.out.println();
        System.out.print("Postorder Traversal : ");
        postorder(root);
    }

}