package Semester_2.Pemrograman_2.Week_5.Ham;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
    Ham
    Ham a   Lamb b
    Lamb b

    Ham
    Ham a   Ham b
    Ham b

    Yam
    Yam a   Ham a   Spam b
    Spam b

    Yam
    Yam a   Ham a   Lamb b
    Lamb b
 */

public class hamClient {
    public static void main(String[] args) {
        Ham[] food = {new Lamb(), new Ham(), new Spam(), new Yam()};
        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
            food[i].a();
            System.out.println();     // to end the line of output
            food[i].b();
            System.out.println();     // to end the line of output
            System.out.println();
        }
    }    
}
