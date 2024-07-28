public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 7, 4 };
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int idx = placeAtRightIndex(arr, s, e);
        quickSort(arr, s, idx - 1);
        quickSort(arr, idx + 1, e);
    }

    public static int placeAtRightIndex(int[] arr, int s, int e) {
        int pos = 0;
        for (int i = 0; i < e; i++) {
            if (arr[i] < arr[e]) {
                swap(arr, pos, i);
                pos++;
            }
        }
        swap(arr, pos, e);
        return pos;
    }

    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
