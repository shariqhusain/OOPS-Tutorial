class Student {
    String name;
    int age;
    String course;

    public void write() {
        // this refer to which object want to access and give access to particular
        // object properties
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.course);

    }
    // here we crate the constuctor its name is similar to the class name
    // and it always execute the first

    // contstuctor are of the three types
    // 1. non- parametarised constructor
    // 2. parametarised constructor
    // 3. copy constructor..

    // non- parametarised constructor
    Student() {
        System.out.println(" non-parametarised constructor called first");

    }
    // this is called automatically 
    // if u dont built this then java automatically build this .. parametarised constructor
  
}
 

public class Oops2 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "shariq husain";
        s1.age = 21;
        s1.course = "btech";

        s1.write();

    }
}
