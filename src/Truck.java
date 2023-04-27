import java.util.HashMap;
public class Truck extends Car{
   private double maxCapacity;
    private String fNameDriver;
    private String lNameDriver;

    public Truck(String brandOfCar, double powerOfCar, int yearOfCreate) {
        super(brandOfCar, powerOfCar, yearOfCreate);
    }

    public void goods() {
        HashMap<Integer, String> goods = new HashMap<>();
        goods.put(1, "Яблоки");
        goods.put(2, "Апельсины");
        goods.put(3, "Виноград");
        System.out.println(goods);
    }
    public void printTruckInfo() {
        String capacity = Double.toString(maxCapacity);
        System.out.printf("Максиальная грузоподъемность:\n" + capacity + "\nИмя водителя:\n"
                + fNameDriver + "\nФамилия водителя:\n" + lNameDriver);
    }

}
