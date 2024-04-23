package Semester_2.Pemrograman_2.Week_11;

import java.util.Stack;

public class equals {

    public static boolean Equals(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> auxStack = new Stack<>();

        // Check if the sizes of the stacks are equal
        if (stack1.size() != stack2.size()) {
            restoreStack(stack1, stack2, auxStack);
            return false;
        }

        // Check if the elements in the stacks are equal
        while (!stack1.isEmpty()) {
            if (stack2.isEmpty()) {
                // Restore the original state of the stacks
                restoreStack(stack1, stack2, auxStack);
                return false;
            }

            int element1 = stack1.pop();
            int element2 = stack2.pop();

            if (element1 != element2) {
                // Restore the original state of the stacks
                restoreStack(stack1, stack2, auxStack);
                return false;
            }

            auxStack.push(element1);
        }

        // Restore the original state of the stacks
        restoreStack(stack1, stack2, auxStack);

        return true;
    }

    private static void restoreStack(Stack<Integer> stack1, Stack<Integer> stack2, Stack<Integer> auxStack) {
        while (!auxStack.isEmpty()) {
            if (stack1.isEmpty()) {
                break;
            }
            stack2.push(auxStack.pop());
            stack1.push(auxStack.pop());
        }
    }
}
