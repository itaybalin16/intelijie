import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

//        System.out.println("Hello Java!");
//        int count = 10;
//        System.out.println(count);
//
//        int add = Calculator.sumNums(10, 20);
//        int subtract = Calculator.subtructNums(10, 20);
//        int multiplie = Calculator.mupltiplieNums(10, 20);
//        int divide = Calculator.divideNums(10, 20);
//
//        System.out.println(add);
//        System.out.println(subtract);
//        System.out.println(multiplie);
//        System.out.println(divide);
//
//        משימה 9
//        forLoop.toLoop();


//        int numi;
//        double doubl;
//        String str;
//        boolean bool;
//        int[] ints = new int[3];
//        String[] strgs = new String[3];
//
//        System.out.print("num: ");
//        numi = scn.nextInt();
//
//        System.out.println("double: ");
//        doubl = scn.nextDouble();
//
//        System.out.println("string: ");
//        str = scn.next();
//
//        System.out.println("bool: ");
//        bool = scn.nextBoolean();
//
//        System.out.println("ints: ");
//        for(int i = 0; i < ints.length; i++){
//            ints[i] = scn.nextInt();
//        }
//
//        System.out.println("strs: ");
//        for(int i = 0; i < strgs.length ; i++){
//            strgs[i] = scn.next();
//        }
//        מטלה 11
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        מטלה 12
//        for(int j = 0; j < nums.length ; j++){
//        nums[j] = scn.nextInt();
//        }
//        System.out.println(nums);
//      מטלה 13-14
//        int[] numsNew = new int[5];
//        System.out.println("Please choose 5 nums");
//        for(int d = 1; d < numsNew.length + 1 ; d++){
//            System.out.println("choose num #" + d + ": " );
//            numsNew[d] = scn.nextInt();
//        }
//
//        for (int s = 0; s < numsNew.length; s++) {
//            System.out.print(numsNew[s]);
//        }
//
//        double totalSum = 0;
//        for (int j = 0; j < numsNew.length; j++) {
//            totalSum += numsNew[j];
//        }
//        double average = totalSum / numsNew.length;
//
//        System.out.println("the total average is: " + average);
//        מטלה16
//        System.out.println("first name: ");
//        String firstName = scn.nextLine();
//
//        System.out.println("last name");
//        String lastName = scn.nextLine();
//
//        System.out.println("address: ");
//        String address = scn.nextLine();
//
//        System.out.println("id: ");
//        int id = scn.nextInt();
//
////        Student st1 = new Student("itay", "balin", "afula", 209248715);
//        Student st1 = new Student(firstName, lastName, address ,id);
//        st1.studentDetails();
//
//        מטלה 17-19
//        Person ps1 = new Person("itay balin", 16, 06, 2023);
//        int age = ps1.calculateAge();
//        String name = ps1.getName();
//        System.out.println(name + " is " + age + " old");
//        boolean adult = ps1.isAdult();
//        System.out.println(adult);
//        String minor = ps1.isMinor();
//        System.out.println(minor);
        String word = "21312312";
        String result = isDigit(word);
        System.out.println(result);

        String stringy = "itay";
        String reverse = reverseString(stringy);
        System.out.println(reverse);

    }

    public static String isDigit(String word){
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if (!Character.isDigit(ch)){
                return "string isn't only dig";
            }
        }
        return "string is only digits";
    }

    public static void reverseString(){
        String reversed;
        for (int j = word.length(); j > 1; j--){
            char ch = word.charAt(j);
            System.out.print(ch);
        }
        return "done";
    }

}

