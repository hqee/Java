package Semester_2.Pemrograman_2.Week_5.Snow;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        Example 1 :
            Sleet 2
            Snow 2
            Sleet 3

        Example 2 : Error
        Example 3 : Error
 */

public class snowClient {
    public static void main(String[] args) {
        // Example 1 
        Snow var1 = new Sleet();
        var1.method2();    

        // // Example 2 ->> erorr
        // Snow var2 = new Rain();
        // var2.method1();
    
        // //Example 3: --> erorr
        // Snow var3 = new Rain();
        // ((Sleet) var3).method3();
    }
}
