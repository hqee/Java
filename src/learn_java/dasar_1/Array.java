package learn_java.dasar_1;

public class Array {
    public static void main(String[] args) {
        String[] nama;
        nama = new String[3];

        nama[0] = "Ghibran Akhsan";
        nama[1] = "Haqi";
        nama[2] = "Dhiya";

        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.println(nama[2]);

        int[] arrayLangsung = new int[]{
            1, 2, 3, 4, 5, 6
        };

        long[] arrayLong = {
            10, 20, 30, 40, 50
        };

        arrayLangsung[1] = 100;

        System.out.println(arrayLangsung[1]);
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong.length);

        String[][] member = {
            {"Ghibran", "Haqi"}, 
            {"Dhiya", "Asri"},
            {"ataullah"},
        };

        System.out.println(member[0][0]);
        System.out.println(member[2][0]);
    }
}
