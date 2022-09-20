//we decleared here student class
// class is nothing but it is blue print of any objects or things 
 class Student{
    String name;
    int age;
    String course;

    public void write(){

        // this refer to which object want to access and give access to particular object properties
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.course);

    }


 }


public class Oops1 {
    public static void main(String args[]) {

        Student s1=new Student();
        s1.name="shariq husain";
        s1.age=21;
        s1.course="btech";
         
        s1.write();
        
    } 
}
