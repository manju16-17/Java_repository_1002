class Student {
    // Fields
    String name;
    int age;

    // Method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        // Create object
        Student s1 = new Student();

        // Assign values
        s1.name = "Kishan";
        s1.age = 21;

        // Call method
        s1.display();
    }
}
