import java.util.ArrayList;
import java.util.List;

public class Max_element_in_BT {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node createNode(Integer[] a, int i) {
        if (i >= a.length || a[i] == null) {
            return null;
        }
        Node newNode = new Node(a[i]);
        newNode.left = createNode(a, 2 * i + 1);
        newNode.right = createNode(a, 2 * i + 2);
        return newNode;
    }

    public static void main(String[] args) {
        Integer[] a = { 32, 26, 47, 19, null, null, 56, null, 27 };
        Node root = createNode(a, 0);
        System.out.println(findMax(root));
        System.out.println(findMin(root));
        List<Integer> ans = inorderTraversal(root);
        System.out.println(ans);
    }

    public static int findMax(Node root) {
        // code here
        if (root == null)
            return Integer.MIN_VALUE;

        int left = findMax(root.left);
        int right = findMax(root.right);

        return Math.max(Math.max(left, right), root.val);
    }

    public static int findMin(Node root) {
        // code here
        if (root == null)
            return Integer.MAX_VALUE;

        int left = findMin(root.left);
        int right = findMin(root.right);

        return Math.min(Math.min(left, right), root.val);
    }

    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> res = new ArrayList<>();
        inorderTraverse(root, res);
        return res;
    }

    public static void inorderTraverse(Node root, List<Integer> ans) {
        if (root == null)
            return;
        inorderTraverse(root.left, ans);
        ans.add(root.val);
        inorderTraverse(root.right, ans);
    }
}
