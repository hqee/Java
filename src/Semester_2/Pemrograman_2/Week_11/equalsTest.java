package Semester_2.Pemrograman_2.Week_11;

/*
 * Nama     : Haqi Dhiya Firmana
 * NIM      : 23051130016
 * Kelas    : J2
 */

import java.util.Stack;

public class equalsTest {
    public static void main(String[] args) {
        // Create two stacks with equal elements
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        // Test the Equals method with equal stacks
        boolean result1 = equals.Equals(stack1, stack2);
        System.out.println("Are the stacks equal? " + result1);

        // Create two stacks with different elements
        Stack<Integer> stack3 = new Stack<>();
        Stack<Integer> stack4 = new Stack<>();
        stack3.push(1);
        stack3.push(2);
        stack3.push(3);
        stack4.push(4);
        stack4.push(5);
        stack4.push(6);

        // Test the Equals method with different stacks
        boolean result2 = equals.Equals(stack3, stack4);
        System.out.println("Are the stacks equal? " + result2);
    }
}
/*
 * Output :
 * Are the stacks equal? true
 * Are the stacks equal? false
 */