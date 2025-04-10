import java.util.Scanner;

//Itay Balin
//Yiska Malka
public class Main {
    public static void main(String[] args) {
        boolean keepRunning = true;
        String[] teachers = new String[1];
        int numOfT = 0;
        String[] committee = new String[1];
        int numOfC = 0;
        String[] faculty = new String[1];
        int numOfF = 0;
        Scanner scn = new Scanner(System.in);

        while (keepRunning) {
            menuPrint();
            int num = scn.nextInt();

            if (num == 0) {
                System.out.println("You choose 0 -the program is dead. bye!");
                keepRunning = false;
            }
            if (num == 1) {
                addToArr(teachers, numOfT);
                numOfT++;
            }
            if (num == 2) {
                addToArr(committee, numOfC);
                numOfC++;
            }
            if (num == 3) {
                addToArr(faculty, numOfF);
                numOfF++;
            }
            if (num == 4) {
                String nameT = getName(teachers);
                String nameC = getName(committee);
                boolean checkT = checkNameInArr(nameT, teachers);
                boolean checkC = checkNameInArr(nameC, committee);
                if (checkC) {
                    System.out.println("no such teacher.");
                }
                if (checkT) {
                    System.out.println("no such committee.");
                }
            }
            if (num == 5) {
                System.out.println("to be added");
            }
            if (num == 6) {
                System.out.println("to be added");
            }
            if (num == 7) {
                printArr(teachers, numOfT);
            }
            if (num == 8) {
                printArr(committee, numOfC);
            }
            num = scn.nextInt();
//            if (num != int){
//                System.out.println("Invalid input");
//                break;
//            }
//            switch (num){
//                case 0:
//                    System.out.println("You choose 0 -the program is dead. bye!");
//                    keepRunning = false;
//                    break;
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                case 5:
//                case 6:
//                case 7:
//                case 8:
        }
    }

    private static void printArr(String[] arr, int numOf) {
        if (numOf == 0) {
            System.out.println("No names to print");
            return;
        }
        for (int i = 0; i < numOf; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void addToArr(String[] arr, int numOfThings) {
//        System.out.println("Please enter a teacher to add: ");
        String name = getName(arr);
//        boolean nameInArr = checkNameInArr(name, arr);
//        while (!nameInArr){
//            System.out.println("name already in arry, try again: ");
//            name = getName();
//            nameInArr = checkNameInArr(name, arr);
//        }
        if (numOfThings == arr.length) {
            arr = makeArrBigger(arr);
        }
        arr[numOfThings] = name;
        System.out.println(name + " is added to arr! :)");
    }

    private static String getName(String[] arr) {
        Scanner scn = new Scanner(System.in);
        String name;
        System.out.println("Please enter a name to add: ");
        for (name = scn.nextLine(); !checkNameInArr(name, arr); name = scn.nextLine()) {
            System.out.println("Name is already in arr, pick again: ");
        }
        return name;
    }

    private static boolean checkNameInArr(String name, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && name.equals(arr[i])) {
                return false;
            }
        }
        return true;
    }

    private static String[] makeArrBigger(String[] oldArr) {
        String[] newArr = new String[oldArr.length * 2];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        System.out.println("Arry was too small. now is 2x bigger! new size is: " + newArr.length);
        return newArr;
    }

    private static void menuPrint() {
        System.out.println();
        System.out.println("Please choose a number, choose 0 to exit: ");

        System.out.println("0 - exit");
        System.out.println("1 - add teacher");
        System.out.println("2 - add committee");
        System.out.println("3 - add department");
        System.out.println("4 - add teacher to a committee");
        System.out.println("5 - show salary average of all teachers");
        System.out.println("6 - show salary average of the teachers in specific department");
        System.out.println("7 - show all teachers details");
        System.out.println("8 - show all committees details");
        System.out.println("choose a number, pick 0 to exit");
    }
}
//        import java.util.Scanner;
//
//        public class Menu {
//            private static int[] numbers = new int[3];
//            private static int size = 0;
//
//            public static void main(String[] args){
//                System.out.println("Welcome to Array Creator: ");
//                boolean isRunning = true;
//                while(isRunning){
//                    printMenu();
//                    int value = getNumberFromUser();
//                    if(value==0){
//                        isRunning = false;
//                    }else{
//                        if(size < numbers.length){
//                            numbers[size++] = value;
//                        }else{
//                            extendsArray(2);
//                            numbers[size++] = value;
//                        }
//                    }
//                }
//                printArray(numbers,size);
//            }
//
//            private static void printArray(int[] arr, int size){
//                for(int i=0; i<size; i++){
//                    System.out.print(arr[i] + " ");
//                }
//                System.out.println();
//            }
//
//            private static void extendsArray(int k) {
//                int[] arr = new int[size*k];
//                copyArrays(numbers, arr);
//                numbers = arr;
//            }
//
//            private static void copyArrays(int[] oldArray, int[] newArray) {
//                for(int i=0; i<size; i++){
//                    newArray[i] = oldArray[1];
//                }
//            }
//
//            private static int getNumberFromUser() {
//                System.out.println("Enter a number: ");
//                Scanner scan = new Scanner(System.in);
//                return scan.nextInt();
//            }
//
//            private static void printMenu() {
//                System.out.print("Enter number or '0' to exit: ");
//            }
//        }