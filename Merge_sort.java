import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 1, 7, 9, 8 };
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }

    public static int[] mergeSort(int[] arr, int s, int e) {
        if (s == e) {
            int[] a = new int[1];
            a[0] = arr[s];
            return a;
        }
        int mid = s + (e - s) / 2;
        int[] left = mergeSort(arr, s, mid);
        int[] right = mergeSort(arr, mid + 1, e);
        return mergeTwoSortedArray(left, right);
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }
}
