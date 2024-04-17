package learn_java.dasar_1;
class doWhileLoop {
    public static void main(String[] args) {
        var counter = 10;
        
        do {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        } while (counter <= 20);
    }
}