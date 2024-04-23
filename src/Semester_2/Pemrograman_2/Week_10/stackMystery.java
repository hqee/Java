package Semester_2.Pemrograman_2.Week_10;

import java.util.Stack;

/*  
 * Nama : Haqi Dhiya Firmana
 * NIM  : 230511630016
 * Kelas : J2
 
 * Ouput :
    10 10 5 2 3 8 3
 */

public class stackMystery {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(7);
        s.push(10);
        System.out.print(s.peek() + " ");
        System.out.print(s.pop() + " ");
        s.push(3);
        s.push(5);
        System.out.print(s.pop() + " ");
        System.out.print(s.size() + " ");
        System.out.print(s.peek() + " ");
        s.push(8);
        System.out.print(s.pop() + " ");
        System.out.print(s.pop());
    }
}
