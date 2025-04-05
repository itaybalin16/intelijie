import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String address;
    private int id;

    public Student(String firstName, String lastName, String address, int id) {
        if (firstName.length() < 2) {
        this.firstName = "פלוני";
        }else {
            this.firstName = firstName;
        }
        if (lastName.length() < 2){
            this.lastName = "אלמוני";
        }else {
            this.lastName = lastName;
        }
        this.address = address;
        this.id = id;
    }
    public void studentDetails(){
        System.out.println("the students full name is: " + firstName + " " + lastName);
        System.out.println("his address is: " + address);
        System.out.println("and he's id is: " + id);
    }
}
