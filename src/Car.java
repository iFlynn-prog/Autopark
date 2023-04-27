public class Car {
    private String brandOfCar;
    private double powerOfCar;
    private int yearOfCreate;

    public Car(String brandOfCar, double powerOfCar, int yearOfCreate) {
        this.brandOfCar = brandOfCar;
        this.powerOfCar = powerOfCar;
        this.yearOfCreate = yearOfCreate;
    }

    public void printMainInfo() {
        System.out.printf("Марка машины:\n" + brandOfCar + "\nМощность двигателя:\n"
                + powerOfCar + "\nГод выпуска:\n" + yearOfCreate + "\n");
    }
}
