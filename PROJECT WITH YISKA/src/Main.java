//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    private static String[] teacher = new String[3];
    private static int sizeT = 0;
    private static String[] department = new String[3];
    private static int sizeD = 0;
    private static String[] committee = new String[3];
    private static int sizeC = 0;

//    public Main() {
//    }
    public static void main(String[] args) {
        boolean keepRunning = true;

        while(keepRunning) {
            printMenu();
            int val = getNumberFromUser();
            if (val == 0) {
                System.out.println("The program is dead. bye!");
                keepRunning = false;
            }

            if (val == 1) {
                String name = getName(teacher, sizeT);
                teacher = addNameToArray(teacher, sizeT, name);
                ++sizeT;
            }

            if (val == 2) {
                String name = getName(committee, sizeC);
                teacher = addNameToArray(committee, sizeC, name);
                ++sizeC;
            }

            if (val == 3) {
                String name = getName(department, sizeD);
                teacher = addNameToArray(department, sizeD, name);
                ++sizeD;
            }

            if (val == 4) {
                Scanner scn = new Scanner(System.in);
                System.out.println("Please enter a teacher's name: ");
                String teacherName = scn.nextLine();
                System.out.println("Please enter a committee name: ");
                String committeeName = scn.nextLine();
                if (checkName(teacher, teacherName, sizeT)) {
                    System.out.println(teacherName + " isn't a teacher");
                }

                if (checkName(committee, committeeName, sizeC)) {
                    System.out.println(committeeName + " isn't a committee");
                }
            }

            if (val == 5) {
                showAverage();
            }

            if (val == 6) {
                showAverage();
            }

            if (val == 7) {
                printArray(teacher, sizeT);
            }

            if (val == 8) {
                printArray(committee, sizeC);
            }

            if (val > 8) {
                System.out.println("This isn't an option, try again :) ");
            }
        }

    }

    private static void showAverage() {
        System.out.println("yet to come");
    }

    private static boolean checkName(String[] arr, String val, int size) {
        for(int i = 0; i < size; ++i) {
            if (arr[i].equals(val)) {
                return false;
            }
        }
        return true;
    }

    private static void printArray(String[] arr, int size) {
        for(int i = 0; i < size; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    private static String[] addNameToArray(String[] array, int size, String name) {
        if (size >= array.length) {
            array = extendArrays(array);
        }

        array[size] = name;
        return array;
    }

    private static String[] extendArrays(String[] oldArray) {
        String[] arr = new String[oldArray.length * 2];

        for(int k = 0; k < oldArray.length; ++k) {
            arr[k] = oldArray[k];
        }

        System.out.println("extend to : " + arr.length);
        return arr;
    }

    private static String getName(String[] arr, int size) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter name to :");
        String name;
        for(name = scn.nextLine(); !checkName(teacher, name, size); name = scn.nextLine()) {
            System.out.println("Name is already in arry, choose another: ");
        }
        return name;
    }

    private static int getNumberFromUser() {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter your choice");
        return scn.nextInt();
    }

    private static void printMenu() {
        System.out.println("Choose a number, press 0 to exit: ");
        System.out.println("0 - exit");
        System.out.println("1 - add teacher");
        System.out.println("2 - add committee");
        System.out.println("3 - add department");
        System.out.println("4 - add teacher to committee");
        System.out.println("5 - show salaries average of all teachers");
        System.out.println("6 - show salaries average of the teachers in specific department");
        System.out.println("7 - show all teachers details");
        System.out.println("8 - show all committees details");
    }
}
