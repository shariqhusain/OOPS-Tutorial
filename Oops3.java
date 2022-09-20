class Student {
    String name;
    int age;
    String course;

    public void write() {
        // // this refer to which object want to access and give access to particular
        // // object properties
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.course);

    }
    // contstuctor are of the three types
    // 1. non- parametarised constructor
    // 2. parametarised constructor
    // 3. copy constructor.

    // parametarised constructor
    Student(String name, int age, String course) {
        System.out.println(" parametrised is called first");
        this.name = name;
        this.age = age;
        this.course = course;

    }

}

public class Oops3 {
    public static void main(String args[]) {
        Student s1 = new Student("shariq", 21, "btech");

        s1.write();

    }

}
