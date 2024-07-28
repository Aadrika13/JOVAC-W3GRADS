import java.util.*;

public class Place_the_last_element_at_correct_index {
    public static void main(String[] args) {
        // int[] arr = { 10, 5, 4, 3, 8, 9, 6 };
        // int n = arr.length - 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[n - 1]) {
                swap(arr, pos, i);
                pos++;
            }
        }
        swap(arr, pos, n - 1);
        // System.out.println(pos);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
        System.out.println();
        System.out.println(placeAtRoghtIndex(arr, 0, n - 1));
    }

    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    public static int placeAtRoghtIndex(int[] arr, int s, int e) {
        int element = arr[e];
        int position = s;
        for (int i = s; i < e; i++) {
            if (arr[i] < element) {
                swap(arr, position, i);
                position++;
                // System.out.println(position);
            }
        }
        swap(arr, e, position);
        // System.out.println(Arrays.toString(arr));
        return position;
    }
}
