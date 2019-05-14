public class Rectangle extends Shape {
    int number2;

    public Rectangle(int number1, int number2){
        super(number1);
        this.number2 = number2;
    }

    public String toString() {
        double area = this.number1*this.number2;
        return "The area is " + area;
    }
}
