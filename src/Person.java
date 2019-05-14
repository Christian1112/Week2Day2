public class Person {
    String name;
    int age;
    int id;

    public Person(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String toString(){
        return "name: " + this.name + ", age: " + this.age + ", id: " + this.id;
    }
}