import java.util.Scanner;

public class Binary_Tree {
    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root = null;

    private static Scanner sc = new Scanner(System.in);

    public Binary_Tree() {
        this.root = createTree();
    }

    private Node createTree() {
        int data = sc.nextInt();

        Node node = new Node(data);

        int isLeftChildPresent = sc.nextInt();
        if (isLeftChildPresent == 1) {
            node.left = createTree();
        }

        int isRightChildPresent = sc.nextInt();
        if (isRightChildPresent == 1) {
            node.left = createTree();
        }
        return node;
    }

    public void print() {
        print(this.root);
    }

    private void print(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.left + " <- " + root.data + " -> " + root.right);
        print(root.left);
        print(root.right);
    }
}
