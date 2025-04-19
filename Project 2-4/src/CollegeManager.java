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

    public void addTeacher(String name, String id, Teacher.AcademicRank degree, String degreeName, int salary, String department) {
        Teacher t = new Teacher(name, id, degree, degreeName, salary, department);

        if (numOfT == teachers.length){
            teachers = extendArrTeachers(teachers);
        }

        teachers[numOfT++] = t;

        System.out.println("Teacher added successfully.");
    }

    public void addDepartment(String depName, int numStudents, Teacher[] teachersInDep) {
        Department d = new Department(depName, numStudents, teachersInDep);

        if (numOfD == departments.length){
            departments = extendArrDepartment(departments);
        }

        departments[numOfD++] = d;

        System.out.println("Department added successfully.");
    }

    public void addCommittee(Teacher chairman, String committeeName, Teacher[] teachers) {
        Committee c = new Committee(chairman, committeeName, teachers);

        committees[numOfC++] = c;

        System.out.println("Committee added successfully.");
    }

//    private Committee createCommittee(){
//        Scanner scn = new Scanner(System.in);
//
//        System.out.println("Enter chairman name: "); //לעשות השוואה של תז
//        String chairman;
//        for (chairman = scn.nextLine(); !checkIfTeacher(chairman, teachers, numOfT); chairman = scn.nextLine()){
//            System.out.println("Chairman isn't a teacher, try again!");
//        }
//
//        Teacher t = getTeacher(chairman);
//
//        if (t.getRank().ordinal() >= Teacher.AcademicRank.DR.ordinal()){
//
//        }
//
//
//
//        System.out.println("Enter committee name: ");
//        String name = scn.nextLine();
//
//
//        System.out.println("Enter number of teachers in committee: ");
//        int numOfTeachers = scn.nextInt();
//        System.out.println();
//
//        Teacher[] teachers = new Teacher[numOfTeachers];
//
//        Committee c = new Committee(name, teachers)
//
//    }



    public Teacher getTeacher(String id){
        for (int i = 0; i < numOfT ; i++){
            if (id.equals(teachers[i].getId())){
                return teachers[i];
            }
        }
        return null;
    }

    public boolean checkIfTeacherInArr(String id){
        for (int i = 0; i < numOfT; i++) {
            if (id.equals(teachers[i].getId())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfDepartmentExist(String depName){
        for (int i = 0; i < numOfD ; i++){
            if (depName.equals(departments[i].getDepartmentName())){
                return true;
            }
        }
        return false;
    }

    public boolean checkChairman(String id){
        boolean ifTeacher = checkIfTeacherInArr(id);

        if (!ifTeacher){
            return false;
        }

        Teacher t = getTeacher(id);

        if (t.getDegree().ordinal() < Teacher.AcademicRank.DR.ordinal()){
            return false;
        }

        return true;

    }

//    private  boolean checkNameInArr(String name, String[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != null && name.equals(arr[i])) {
//                return false;
//            }
//        }
//        return true;
//    }

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

