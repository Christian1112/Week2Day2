public class ElectricCar extends Car {
    int batteryLife;
    int chargeTime;

    public ElectricCar (String brand, String type, String color, int horsePower, int batteryLife, int chargeTime){
        super(brand, type, color, horsePower);
        this.batteryLife = batteryLife;
        this.chargeTime = chargeTime;
    }

    public String toString(){
        return "Brand: " + this.brand + ", type: " + this.type + ", color: " + this.color + ", horsepower: " + this.horsePower + ", batterylife: " + this.batteryLife + "h, charge time: " + this.chargeTime + "h!";
    }
}
