package Semester_2.Pemrograman_2.Week_5.Bar;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
        baz
        baz 1
        foo 2

        foo
        foo 1
        bar 2

        baz
        baz 1
        mumble 2

        foo
        foo 1
        foo 2
 */

public class fooClient {
    public static void main(String[] args) {
        Foo[] pity = {new Baz(), new Bar(), new Mumble(), new Foo()};
        for (int i = 0; i < pity.length; i++) {
            System.out.println(pity[i]);
            pity[i].method1();
            pity[i].method2();
            System.out.println();
        }
    }
}
