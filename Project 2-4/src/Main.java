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
            scn.nextLine();
            switch (num) {
                case 0:
                    System.out.println("You choose 0 - the program is dead. bye!");
                    keepRunning = false;
                    break;
                case 1:
                    System.out.println("You choose 1 - adding a teacher");

                    System.out.println("Enter ID:");
                    String id = scn.nextLine();

                    while (manager.checkIfTeacherInArr(id)){
                        System.out.println("teacher already exists, try again!");
                        id = scn.nextLine();
                    }

                    System.out.println("Enter teacher's full name:");
                    String teacherName = scn.nextLine();

                    System.out.println("Enter degree (NONE / BSC / MSC / DR / PROF:");
//                    String degree = scn.nextLine().toUpperCase();
                    Teacher.AcademicRank degree = Teacher.AcademicRank.DR;
//                    להבין איך אני משתמש בזה עם SWITCH

                    System.out.println("Enter degree name:");
                    String degreeName = scn.nextLine();

                    System.out.println("Enter salary:");
                    int salary = scn.nextInt();
                    scn.nextLine();

                    System.out.println("Enter department name (if has one):");
                    String department = scn.nextLine();

                    manager.addTeacher(teacherName, id, degree, degreeName, salary, department);
                    break;
                case 2:
                    System.out.println("You choose 2 - adding a committee");

                    System.out.println("Enter chairman id: "); //לעשות השוואה של תז
                    String chairmanID = scn.nextLine();

                    while (manager.checkChairman(chairmanID)){
                        System.out.println("Future chairman isn't a good fit, try again!");
                        chairmanID = scn.nextLine();
                    }

                    Teacher chairman =  manager.getTeacher(chairmanID);

                    System.out.println("Enter committee name: ");
                    String committeeName = scn.nextLine();


                    System.out.println("Enter number of teachers in committee: ");
                    int numOfTeachersC = scn.nextInt();
                    System.out.println();

                    Teacher[] teachers = new Teacher[numOfTeachersC];

                    manager.addCommittee(chairman, committeeName, teachers);
                    break;
                case 3:
                    System.out.println("You choose 3 - adding a member to a committee");
                    break;
                case 4:
                    System.out.println("You choose 4 - updating the chairman");
                    break;

                case 5:
                    System.out.println("You choose 5 - removing a member from a committee");
                    break;

                case 6:
                    System.out.println("You choose 6 - adding a department");

                    System.out.println("Enter department name:");
                    String departmentName = scn.nextLine();

                    while(manager.checkIfDepartmentExist(departmentName)){
                        System.out.println("department already exists, try again!");
                        departmentName = scn.nextLine();
                    }

                    System.out.println("Enter number of students:");
                    int numStudents = scn.nextInt();
                    scn.nextLine();

                    System.out.println("Enter num of teachers teaching:");
                    int numOfTeachersD = scn.nextInt();
                    scn.nextLine();
                    Teacher[] teachersInDep = new Teacher[numOfTeachersD];

                    manager.addDepartment(departmentName, numStudents, teachersInDep);
                    break;

                case 7:
                    System.out.println("You choose 7 - showing average salaray of all teachers");
                    break;
                case 8:
                    System.out.println("You choose 8 - showing average salary of a specific department");
                    break;
                case 9:
                    System.out.println("You choose 9 - showing details of all teachers");
                    break;
                case 10:
                    System.out.println("You choose 10 - showing all committees");
                    break;
            }
        }
    }

    private static void menuPrint() {
        System.out.println();
        System.out.println("Please choose a number, choose 0 to exit: ");
        System.out.println("0 - exit");
        System.out.println("1 - add a teacher to the college");
        System.out.println("2 - add committee to the college");
        System.out.println("3 - add a member to a committee");
        System.out.println("4 - update the committee chairman ");
        System.out.println("5 - remove a member from the committee");
        System.out.println("6 - add department");
        System.out.println("7 - show salary average of all teachers");
        System.out.println("8 - show salary average of the teachers in specific department");
        System.out.println("9 - show all teachers details");
        System.out.println("10 - show all committees details");
    }
}