package learn_java.dasar_1;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Haqiii", "kamu habis dari manaa");
        sayHello("Ghibran", "udah mandi blm");
    }   

    static void sayHello(String name, String kamuNanya) {
        System.out.println("Hello " + name + "! , " + kamuNanya + "?");
    }
}
