package Contest2;

import java.util.*;

public class Question2 {
    /**
     * 
     * @param root Root Node
     * @param k    Minimum difference in height of subtrees for uneven node
     * @return Number of uneven nodes
     */
    public static int countUneven(Node root, int k) {
        if (root == null) {
            return 0;
        }
        int c = 0;
        int l = height(root.left);
        int r = height(root.right);
        if (Math.abs(l - r) >= k) {
            c++;
        }
        return c + countUneven(root.left, k) + countUneven(root.right, k);
    }

    private static int height(Node curr) {
        if (curr == null) {
            return 0;
        }
        return 1 + Math.max(height(curr.left), height(curr.right));
    }

    public static Node createTree(int a[], int i) {
        if (i >= a.length || a[i] == -1)
            return null;
        Node newnode = new Node(a[i]);
        newnode.left = createTree(a, 2 * i + 1);
        newnode.right = createTree(a, 2 * i + 2);
        return newnode;
    }

    public static void main(String args[]) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int a[] = new int[n];
        // read values
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sc.close();
        Node root = createTree(a, 0);

        System.out.println(countUneven(root, k));
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
};
