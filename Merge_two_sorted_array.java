import java.util.Arrays;

public class Merge_two_sorted_array {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 5 };
        int[] arr2 = { 1, 2, 3, 4 };
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;
        // for (int k = 0; k < arr3.length; k++) {
        // if (arr1[i] <= arr2[j] && i < arr1.length) {
        // arr3[k] = arr1[i];
        // i++;
        // } else if (arr1[i] > arr2[j] && j < arr2.length) {
        // arr3[k] = arr2[j];
        // j++;
        // }
        // }
        // System.out.println(Arrays.toString(arr3));
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

        System.out.println(Arrays.toString(arr3));
    }
}