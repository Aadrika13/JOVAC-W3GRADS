public class Number_of_Nodes_in_BinaryTree {
    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int countNodes(Node root) {
        int[] c = new int[1];
        cal(root, c);
        return c[0];
    }

    public static void cal(Node root, int[] c) {
        if (root == null) {
            return;
        }
        if (root != null) {
            c[0]++;
        }
        cal(root.left, c);
        cal(root.right, c);
    }

    public static void main(String[] args) {

    }
}
