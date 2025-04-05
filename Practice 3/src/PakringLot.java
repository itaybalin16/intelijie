    import java.util.Objects;

    public class PakringLot {
        private int carId;
        private String name, address;
        private Car[] regularParkingLot;
        private Car[] handicappedParking;
        private int numsOfRegularCarsSpots;
        private int numsOfHandicappedCarsSpots;

        public PakringLot(int carId, String name, String address, Car[] regularParkingLot, Car[] handicappedParking) {
            setCarId(carId);
            setName(name);
            setAddress(address);
            this.numsOfRegularCarsSpots = 0;
            this.numsOfHandicappedCarsSpots = 0;
            this.regularParkingLot = new Car[numsOfRegularCarsSpots];
            this.handicappedParking = new Car[numsOfHandicappedCarsSpots];
        }

        public boolean park(Car c, boolean isHandicapped){
            return false;
        }

        public boolean park(Car c, boolean isHandicapped) {
            return false;
        }

        public Car exit(String plateNumber, boolean isHandicapped) {
            return null;
        }

        public int findByPlateNumber(String plateNumber, boolean isHandicapped) {
            return -1;
        }

        public int size() {
            return 0;
        }

        public int size(boolean isHandicapped) {
            return 0;
        }

        public int getNumOCars() {
            return 0;
        }

        public int getNumOfCars(boolean isHandicapped) {
            return 0;
        }

        public int getNextCarParkingSpot(boolean isHandicapped) {
            return -1;
        }

        public boolean isFull() {
            return isFull(true) && isFull(false);
        }

        public boolean isFull(boolean isHandicapped) {
            return isHandicapped? numsOfHandicappedCarsSpots==handicappedParking.length : numsOfRegularCarsSpots==regularParkingLot;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            PakringLot that = (PakringLot) o;
            return carId == that.carId;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(carId);
        }

        @Override
        public String toString() {
            return "ParkingLot{" +
                    "name='" + name + '\'' +
                    ", numsOfRegularCarsSpots=" + numsOfRegularCarsSpots +
                    ", numsOfHandicappedCarsSpots=" + numsOfHandicappedCarsSpots +
                    '}';
        }

        public int getNumsOfHandicappedCarsSpots() {
            return numsOfHandicappedCarsSpots;
        }

        public int getNumsOfRegularCarsSpots() {
            return numsOfRegularCarsSpots;
        }

        public int getCarId() {
            return carId;
        }

        public void setCarId(int carId) {
            this.carId = carId;
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
    }


