package learn_java.dasar_1;

public class whileLoop {
    public static void main(String[] args) {
        var counter = 1;

        while (counter <= 100) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }
    }
}