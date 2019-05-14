public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Benjamin", 21, 0);
        System.out.println(person1.toString());

        Student student1 = new Student("Christian", 26, 1, 1);
        System.out.println(student1.toString());

        Teacher teacher1 = new Teacher("Zeljko", 40, 2, "black");
        System.out.println(teacher1.toString());
    }
}
