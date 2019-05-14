public class Circle extends Shape {

    public Circle(int number1){
        super(number1);
    }

    public String toString() {
        double area = Math.PI*Math.pow(this.number1, 2.0);
        return "The area is " + area;
    }
}
