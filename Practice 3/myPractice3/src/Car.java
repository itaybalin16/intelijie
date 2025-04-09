
import java.util.Objects;
public class Car {
    private String Brand;
    private String Model;
    private String Color;
    private int Year;
    private String PlateNumber;
    private boolean IsHandicapped;

    public Car(String brand, String model, String color, int year, String plateNumber, boolean isHandicapped) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setYear(year);
        setPlateNumber(plateNumber);
        setHandicapped(isHandicapped);
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getPlateNumber() {
        return PlateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        PlateNumber = plateNumber;
    }

    public boolean isHandicapped() {
        return IsHandicapped;
    }

    public void setHandicapped(boolean handicapped) {
        IsHandicapped = handicapped;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(PlateNumber, car.PlateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(PlateNumber);
    }

    @Override
    public String toString() {
        return "Car{"+"Brand='" + Brand +"model="+ Model + "PlateNumber='" + PlateNumber + '}';
    }
}
