
public class Dog {

    public String name;
    public int age;
    public String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void bark() {
        System.out.println(name + "!");
    }

    public void count() {
        for (int i = age; i >= 0; i--) {
            System.out.println(age - i);
        }
        System.out.println("I am " + age);
    }
	
    public void poop(){
        System.out.println("Dog poops " + color);
    }

    public static void main(String[] args) {
        Dog d = new Dog("Sparky", 10, "brown");
        d.count();
        d.bark();
        d.poop();
    }

}
