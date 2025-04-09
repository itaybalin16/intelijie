import java.util.Objects;

public class Parkinglot {
    private int ID;
    private String name;
    private String address;
    private Car[] regularParkingSpots;
    private Car[] handicappedParkingSpots;
    private int numOfRegularcars;
    private int numOfHandicappedCars;

    public Parkinglot(int ID, String name, String address, int numOfRegularCarSpots,int numOfHandicappedCarSpots) {
        setID(ID);
        setName(name);
        setAddress(address);
        this.regularParkingSpots= new Car[numOfRegularCarSpots];
        this.handicappedParkingSpots=new Car[numOfHandicappedCarSpots];
        this.numOfRegularcars = 0;
        this.numOfHandicappedCars = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumOfRegularcars() {
        return numOfRegularcars;
    }

    public int getNumOfHandicappedParkingSpots() {
        return numOfHandicappedCars;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Parkinglot that = (Parkinglot) o;
        return ID == that.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    @Override
    public String toString() {
        return "Parking_lot{" +
                ", name='" + name  +
                ", regular Parking Spots =" +numOfRegularcars +" / " + regularParkingSpots.length +
                ", num Of Handicapped Parking Cars=" + numOfHandicappedCars +"/"+ handicappedParkingSpots.length+
                '}';
    }

    public boolean park(Car car, boolean isHandicapped){
        int index = getNextCarParkingSpot(isHandicapped);
        if (index == -1){

        }
        return true;
    }
    public Car exit(String plateNumber, boolean isHandicapped){
        return car;
    }
    public int findByPlateNumber(String plateNumber, boolean isHandicapped){
    }

    public int getIndexByPlateNumber(Car[] ParkingSpots, String plateNumber) {

    }

    public int size(){
        return ;
    }
    public int size(boolean isHandicapped){
        return ;
    }
    public int getNumOfCars(){
        return ;
    }
    public int getNumOfCars(boolean isHandicapped){
        return ;
    }
    public int getNextCarParkingSpot(boolean isHandicapped){
        return isHandicapped? getEmptySpotIndex(handicappedParkingSpots) : getEmptySpotIndex(regularParkingSpots);
    }

    public int getEmptySpotIndex(Car[] CarSpots) {
        for (int i = 0; i < CarSpots.length; i++) {
            if (CarSpots[i] != null){
                return i;
            }
        }
        return -1;
    }

    public boolean isFull(){
    }
    public boolean isFull(boolean isHandicapped){
    }
}
