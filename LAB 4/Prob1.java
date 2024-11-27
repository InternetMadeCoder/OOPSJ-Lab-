class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Prob1 {
    public static void main(String[] args) {
        Person person1 = new Person("Gayathri", 19);
        Person person2 = new Person("Garvit", 18);

        person1.displayInfo();
        person2.displayInfo();
    }
}
