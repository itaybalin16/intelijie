import java.util.Objects;

public class Car {
    private String manufactor, model, color, licenseNum;
    private boolean isHandicapped;
    private int date, manufactureYear;

    public Car(String manufactor, String model, String color, String licenseNum, boolean isHandicapped, int date, int manufactureYear) {
        setManufactor(manufactor);
        setModel(model);
        setColor(color);
        setLicenseNum(licenseNum);
        setHandicapped(isHandicapped);
        setDate(date);
        setManufactureYear(manufactureYear);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHandicapped() {
        return isHandicapped;
    }

    public void setHandicapped(boolean handicapped) {
        this.isHandicapped = handicapped;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(licenseNum, car.licenseNum);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(licenseNum);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufactor='" + manufactor + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
