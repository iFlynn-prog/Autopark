import java.util.HashMap;

public class PassengerCar extends Car {
    private int numOfPassengers;

    public PassengerCar(String brandOfCar, double powerOfCar, int yearOfCreate, int numOfPassengers) {
        super(brandOfCar, powerOfCar, yearOfCreate);
        this.numOfPassengers = numOfPassengers;
    }

    public void addRecordRepairBook() {

        HashMap<Integer, String> repairBook = new HashMap<>();
        repairBook.put(2011, "Замена двигателя");
        repairBook.put(2012, "Замена машины");
        repairBook.put(2013, "Замена колеса");
        System.out.println(repairBook);
    }

    public void printPassеngerCarInfo() {
        System.out.printf("Количество пассажиров:\n" + numOfPassengers);
    }

}
