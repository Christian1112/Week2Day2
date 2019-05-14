public class Employee {
    String name;
    int age;
    int hourlyRate;

    public Employee(String name, int age, int hourlyRate){
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
    }

    public String toString(){
        return "Name: " + this.name + ", age: " + this.age + ", hourly Rate: " + this.hourlyRate;
    }
}
