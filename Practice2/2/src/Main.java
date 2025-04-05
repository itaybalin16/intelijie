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
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4 ,6, 8};
        int totalSize = arr1.length + arr2.length;
        int[] arr3 = new int[totalSize];
        int[] biggerArr;
        int[] smallerArr;

        if (arr1[0] > arr2[0]){
            biggerArr = arr1;
            smallerArr = arr2;
        }
        else{
            biggerArr = arr2;
            smallerArr = arr1;
        }
        for (int i = 0; i == totalSize ;i++) {
            if (biggerArr.length != i){
                arr3[i] = biggerArr[i];
            }
            if(smallerArr.length != i){
                arr3[i+1] = smallerArr[i];
            }
//            System.out.println(arr3[i]);
        }
        for (int j = 0; j < arr3.length; j++){
            System.out.println(arr3[j]);
        }
    }
}