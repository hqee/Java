package Semester_2.Pemrograman_2.Week_11;

import java.util.Stack;

public class HaqiSlide21 {
    public static int evaluateExpression(String expression) {
        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        if (operand2 != 0) {
                            stack.push(operand1 / operand2);
                        } else {
                            throw new IllegalArgumentException("Cannot divide by zero");
                        }
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            throw new RuntimeException("Invalid expression");
        }
    }

    private static boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }

    public static void main(String[] args) {
        String expression = "5 2 4 * + 7 -";
        System.out.println("The result of the expression is: " + evaluateExpression(expression));
    }
}