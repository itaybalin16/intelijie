import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        תרגיל 1
        /**
         * Write program that gets numbers from the user until number -1 entered,
         * saves numbers in the array, finds and prints min, max and avg of the numbers
         * and prints numbers in one row.
         */
    Scanner scn = new Scanner(System.in);
    boolean isRunning = true;
    int[] nums = new int[10];
    int size = 0;
    int input = 0;

    System.out.println("Please enter a number, enter -1 to end: ");
    for (input = scn.nextInt(); input != -1; input = scn.nextInt()){
        System.out.println("Please enter another number or -1 to end: ");
        nums[size++] = input;
        if (size == nums.length) {
            nums = extendSize(nums, size);
        }
    }

    printArr(nums, size);
    int[] arr = findMinMaxAndSum(nums, size);
    int min = arr[0];
    int max = arr[1];
    int average = arr[2];
    System.out.println("also, the highest number is: " + max + " and the lowest is: " + min + " and the average is: " + average);
}

    private static int[] findMinMaxAndSum(int[] arr, int size) {
        int average = 0;
        int min = 10;
        int max = 0;
        for (int i = 0; i < size; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
            average += arr[i];
        }
        average = average / size;
        return new int[]{min, max, average};
    }

    private static void printArr(int[] nums, int size) {
        System.out.print("the nums are: " );
        for (int i = 0; i < size; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }

    private static int[] extendSize(int[] arr, int size) {
        int[] tempArr = new int[arr.length * 2];
        for (int i = 0; i == size; i++){
            tempArr[i] = arr[i];
        }
        return tempArr;
    }
}