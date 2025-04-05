public class Person {
    private String fullName;
    private int day;
    private int month;
    private int year;

    public Person(String fullName, int day, int month, int year){
        this.fullName = fullName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void personDetails() {
        System.out.println("your full name is " + fullName);
        System.out.println("your date of birth is " + day + "/" + month + "/" + year);
    }

    public int calculateAge(){
        int CURR_YEAR = 2025;
        int age = CURR_YEAR - year;
        return age;
    }

    public String getName() {
        return fullName;
    }
    public boolean isAdult(){
        int age = calculateAge();
        if (age >= 18){
            return true;
        }else {
            return false;
        }
    }
    public String isMinor(){
        int age = calculateAge();
        if (age >= 18){
            return "Adult :(";
        }else{
            return "Minor :)";
        }
    }

}

