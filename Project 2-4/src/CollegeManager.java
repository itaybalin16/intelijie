import java.util.Scanner;


public class CollegeManager {
    private Teacher[] teachers = new Teacher[1];
    private int numOfT = 0;
    private Committee[] committees = new Committee[1];
    private int numOfC = 0;
    private Department[] departments = new Department[1];
    private int numOfD = 0;
    Scanner scn = new Scanner(System.in);


    private void printArr(String[] arr, int numOf) {
        if (numOf == 0) {
            System.out.println("No names to print");
            return;
        }
        for (int i = 0; i < numOf; i++) {
            System.out.println(arr[i]);
        }
    }

    public Teacher createNewTeacher(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter teacher's full name:");
        String name = sc.nextLine();

        System.out.println("Enter ID:");
        String id = sc.nextLine();

        System.out.println("Enter degree (e.g., DR, PROF):");
        String degree = sc.nextLine();

        System.out.println("Enter degree name:");
        String degreeName = sc.nextLine();

        System.out.println("Enter salary:");
        int salary = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter department name (if has one):");
        String department = sc.nextLine();

        Teacher t = new Teacher(name, id, degree, degreeName, salary, department);

        return t;
    }

    public void addTeacher() {
        Teacher t = createNewTeacher();

        if (numOfT == teachers.length){
            teachers = extendArrTeachers(teachers);
        }

        teachers[numOfT++] = t;

        System.out.println("Teacher added successfully.");
    }

    public Department createNewDepartment(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter department name:");
        String name = sc.nextLine();

        System.out.println("Enter number of students:");
        int numStudents = sc.nextInt();
        sc.nextLine();

        Department d = new Department(name, numStudents);

        return d;
    }
    public void addDepartment() {


        departments[numOfD++] = d;

        System.out.println("Department added successfully.");
    }

    public void addCommittee() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter committee name:");
        String name = sc.nextLine();

        Committee c = new Committee(name);

        committees[numOfC++] = c;

        System.out.println("Committee added successfully.");
    }


    public void addToArr(String[] arr, int numOfThings) {
        String name = getName(arr);
        if (numOfThings == arr.length) {
            arr = extendArr(arr);
        }
        arr[numOfThings] = name;
        System.out.println(name + " is added to arr! :)");
    }

    private  String getName(String[] arr) {
        Scanner scn = new Scanner(System.in);
        String name;
        System.out.println("Please enter a name to add: ");
        for (name = scn.nextLine(); !checkNameInArr(name, arr); name = scn.nextLine()) {
            System.out.println("Name is already in arr, pick again: ");
        }
        return name;
    }

    private  boolean checkNameInArr(String name, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && name.equals(arr[i])) {
                return false;
            }
        }
        return true;
    }

    private Teacher[] extendArrTeachers(Teacher[] oldArr) {
        Teacher[] newArr = new Teacher[oldArr.length * 2];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        System.out.println("Array was too small. now is 2x bigger! new size is: " + newArr.length);
        return newArr;
    }

    private Department[] extendArrDepartment(Department[] oldArr) {
        Department[] newArr = new Department[oldArr.length * 2];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        System.out.println("Array was too small. now is 2x bigger! new size is: " + newArr.length);
        return newArr;
    }

    private Committee[] extendArrCommittee(Committee[] oldArr) {
        Committee[] newArr = new Committee[oldArr.length * 2];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        System.out.println("Array was too small. now is 2x bigger! new size is: " + newArr.length);
        return newArr;
    }


//  לכבוד גיל 3>
//    public  void addTeacher(String name, String last) {
//        Teacher t1 =  new Teacher(name, last)
//    }
//    public void addTeacher(String name, String id, String degree, String degreeName, int salary, String departemnt){
//        Teacher t1 = new Teacher(name, id, degree, degreeName, salary, departemnt);
//    }

}

