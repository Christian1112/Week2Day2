public class Teacher extends Person {
    String hairColor;

    public Teacher(String name, int age, int id, String hairColor){
        super(name, age, id);
        this.hairColor = hairColor;
    }

    public String toString(){
        return "name: " + this.name + ", age: " + this.age + ", id: " + this.id + ", hair color: " + this.hairColor;
    }
}
