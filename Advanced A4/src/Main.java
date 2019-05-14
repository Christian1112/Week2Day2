public class Main {

    public static void main(String[] args) {
        Car cars[] = {new ElectricCar("BMW", "X3", "Black", 110, 500, 5), new HybridCar("Chrysler", "Crossfire", "Black", 220, "big")};

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i].toString());
        }
    }
}
