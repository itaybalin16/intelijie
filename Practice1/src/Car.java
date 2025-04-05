// משימה 7+8

public class Car {
    String brand, series;
    int date, topSpeed;

    public Car(String brand, String series, int date, int topSpeed){
        this.brand = brand;
        this.series = series;
        this.date = date;
        this.topSpeed = topSpeed;
    }

    public void describe(){
        System.out.println("Brand: " + brand);
        System.out.println("Series: " + series);
        System.out.println("date:" + date);
        System.out.println("topspeed: " + topSpeed);
    }

    public static void main(String[] arg){
        Car car1 = new Car("Mazda", "Very Fast", 1999, 1000);
        Car car2 = new Car("kaki", " Fast", 99, 10);
        Car car3 = new Car("pipi", "Very ", 19, 00);
        car1.describe();
        System.out.println();
        car2.describe();
        System.out.println();
        car3.describe();
        System.out.println();

    }
}
