/**
 * Write program that gets two sorted arrays with integer numbers
 * and returns one merged sorted array with numbers.
 * example: input: arr1 = {1,3,5,8,10,15} arr2 = {5,8,10} output: arr3 = [1,3,5,5,8,8,10,10,15]
 */
//        int[] arr1 = {1,3,5,8,10,15}, arr2 = {5,8,10};
//        int[] arr3 = mergeArrays(arr1, arr2);
//        printArray(arr3, arr3.length);


public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9, 10};
        int[] arr2 = {2, 4, 6, 8};
        int totalSize = arr1.length + arr2.length;
        int[] arr3 = new int[totalSize];

        int i = 0;
        int j = 0;
        int k = 0;

        for (; i < arr1.length && j < arr2.length; k++) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i++];
            } else {
                arr3[k] = arr2[j++];
            }
        }

        if (i == arr1.length) {
            System.out.println("in if1");
            for (; i < arr2.length; k++) {
                arr3[k] = arr2[i++];
            }
        }
        if (j == arr2.length) {
            System.out.println("in if2");
            for (; j < arr1.length; k++) {
                arr3[k] = arr1[j++];
            }
        }
        for (int p = 0; p < k; p++) {
            System.out.print(arr3[p] + " ");
        }
    }
}