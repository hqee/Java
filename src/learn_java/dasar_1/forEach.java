package learn_java.dasar_1;

public class forEach {
    public static void main(String[] args) {        
        String[] names = {
            "Adi",
            "Aji",
            "Abdi"
        };

        /* for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]); 
        } */

        for (var name : names) {
            System.out.println(name); 
        }
    }
}
