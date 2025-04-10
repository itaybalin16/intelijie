import java.util.Scanner;

//Itay Balin
//Yiska Malka
public class Main {
    public static void main(String[] args) {
        boolean keepRunning = true;
        Scanner scn = new Scanner(System.in);
        CollegeManager manager = new CollegeManager();


        while (keepRunning) {
            menuPrint();
            int num = scn.nextInt();
            switch (num) {
                case 0:
                    System.out.println("You choose 0 - the program is dead. bye!");
                    keepRunning = false;
                    break;
                case 1:
                    System.out.println("You choose 1 -  adding a teacher");
                    manager.addTeacher();
                case 2:
                    System.out.println("You choose 2 - adding a committee");
                    manager.addCommittee();
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("You choose 6 - adding a department");
                    manager.addDepartment();
                case 7:
                case 8:
                case 9:
                case 10:

            }
        }
    }

    private static void menuPrint() {
        System.out.println();
        System.out.println("Please choose a number, choose 0 to exit: ");
        System.out.println("0 - exit");
        System.out.println("1 - add a teacher to the college");
        System.out.println("2 - add committee to the college");
        System.out.println("5 - add a member to a committee");
        System.out.println(" - update the committee chairman ");
        System.out.println(" - remove a member from the committee");
        System.out.println("6 - add department");
        System.out.println("7 - show salary average of all teachers");
        System.out.println("8 - show salary average of the teachers in specific department");
        System.out.println("9 - show all teachers details");
        System.out.println("10 - show all committees details");
        System.out.println("choose a number, pick 0 to exit");
    }
//            if (num == 0) {
//                System.out.println("You choose 0 -the program is dead. bye!");
//                keepRunning = false;
//            }
//            if (num == 1) {
//                manager.addToArr("gil", "efes");
//                numOfT++;
//            }
//            if (num == 2) {
//                addToArr(committee, numOfC);
//                numOfC++;
//            }
//            if (num == 3) {
//                addToArr(faculty, numOfF);
//                numOfF++;
//            }
//            if (num == 4) {
//                String nameT = getName(teachers);
//                String nameC = getName(committee);
//                boolean checkT = checkNameInArr(nameT, teachers);
//                boolean checkC = checkNameInArr(nameC, committee);
//                if (checkC) {
//                    System.out.println("no such teacher.");
//                }
//                if (checkT) {
//                    System.out.println("no such committee.");
//                }
//            }
//            if (num == 5) {
//                System.out.println("to be added");
//            }
//            if (num == 6) {
//                System.out.println("to be added");
//            }
//            if (num == 7) {
//                printArr(teachers, numOfT);
//            }
//            if (num == 8) {
//                printArr(committee, numOfC);
//            }
//        }
//    }

//    private static void printArr(String[] arr, int numOf) {
//        if (numOf == 0) {
//            System.out.println("No names to print");
//            return;
//        }
//        for (int i = 0; i < numOf; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//
//    private static void addToArr(String[] arr, int numOfThings) {
//        String name = getName(arr);
//        if (numOfThings == arr.length) {
//            arr = makeArrBigger(arr);
//        }
//        arr[numOfThings] = name;
//        System.out.println(name + " is added to arr! :)");
//    }
//
//    private static String getName(String[] arr) {
//        Scanner scn = new Scanner(System.in);
//        String name;
//        System.out.println("Please enter a name to add: ");
//        for (name = scn.nextLine(); !checkNameInArr(name, arr); name = scn.nextLine()) {
//            System.out.println("Name is already in arr, pick again: ");
//        }
//        return name;
//    }
//
//    private static boolean checkNameInArr(String name, String[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != null && name.equals(arr[i])) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static String[] makeArrBigger(String[] oldArr) {
//        String[] newArr = new String[oldArr.length * 2];
//        for (int i = 0; i < oldArr.length; i++) {
//            newArr[i] = oldArr[i];
//        }
//        System.out.println("Arry was too small. now is 2x bigger! new size is: " + newArr.length);
//        return newArr;
//    }


}