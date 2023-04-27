public class Autopark {
    public static void main(String[] args) {

        PassengerCar bmw = new PassengerCar("BMW", 400, 2021, 4);
        PassengerCar audi = new PassengerCar("AUDI", 600, 2020, 2);

        Truck scania = new Truck("SCANIA", 777, 2000);
        Truck volvo = new Truck("VOLVO", 600, 2010);

        bmw.printMainInfo();
    }


}
