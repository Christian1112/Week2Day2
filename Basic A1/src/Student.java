public class Student extends Person{
    int average;

    public Student(String name, int age, int id, int average){
        super(name, age, id);
        this.average = average;
    }

    public String toString(){
        return "name: " + this.name + ", age: " + this.age + ", id: " + this.id + ", average: " + this.average;
    }
}