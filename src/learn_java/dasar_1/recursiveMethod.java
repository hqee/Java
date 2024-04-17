package learn_java.dasar_1;

public class recursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
    }
    
    static int factorialLoop (int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++){
            result = result * counter;
        }
        return result;

    }
}

