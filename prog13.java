public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Rakesh", 23);
        s1.display();
    }
}

class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
