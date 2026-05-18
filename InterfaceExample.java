interface Animal {

    void sound();
    void eat();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats food");
    }
}

class Cat implements Animal {

    public void sound() {
        System.out.println("Cat meows");
    }

    public void eat() {
        System.out.println("Cat drinks milk");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();
        d.eat();

        System.out.println();

        c.sound();
        c.eat();
    }
}