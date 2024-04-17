package learn_java.dasar_1;

public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 90, 100};
        sayCongrats("Haqi", values);

        sayCongrats("haqi", 100,200,300,400,500);
    }

    static void sayCongrats (String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", anda lulus");
        } else {
            System.out.println("Maaf " + name + ", anda tidak lulus");
        }
    }
}
