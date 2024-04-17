package learn_java.dasar_1;

public class methodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Haqii");
        sayHello("Haqi", "Dhiya");
    }

    static void sayHello() {
        System.out.println("Hello\n");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name + "\n");
    }

    static void sayHello(String firstName, String lastname ) {
        System.out.println("Hello " + firstName + " " + lastname + "\n");
    }
}
