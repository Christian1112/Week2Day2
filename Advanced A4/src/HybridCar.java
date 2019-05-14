public class HybridCar extends Car {
    String gasTankType;

    public HybridCar(String brand, String type, String color, int horsePower, String gasTankType){
        super(brand, type, color, horsePower);
        this.gasTankType = gasTankType;
    }

    public String toString(){
        return "Brand: " + this.brand + ", type: " + this.type + ", color: " + this.color + ", horsepower: " + this.horsePower + ", gas tank type: " + this.gasTankType + "!";
    }
}
