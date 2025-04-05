public class Date {
    int date, month, year;

    public Date(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public void describe(){
        System.out.println("The full date is " + date + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        Date date1 = new Date(16, 6,1999);
        date1.describe();

    }
}
