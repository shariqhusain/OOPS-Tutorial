
class Animal {
    String name;
    int eyes;
    String eat;

    public void printInfo() {
        System.out.println("its name is" + this.name);
    }

    public void printInfo(int eyes) {
        System.out.println(this.eyes);
    }

    public String printInfo(String eat) {
        return this.eat;
    }
    public void printInfo(int eyes,String eat) {
        System.out.println(this.eyes+ "and"+this.eat);
    }

}

public class Demo {
    public static void main(String args[]) {
        Animal animal1 = new Animal();
        animal1.name = "horse";
        animal1.eyes = 2;
        animal1.eat = "grass";
        // animal1.printInfo();
        // animal1.printInfo("grass");
        // System.out.println(animal1.printInfo(4 ,"grass"));
        animal1.printInfo(4 ,"grass");

    }
}
