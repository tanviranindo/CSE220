import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author - TANVIR RAHMAN
 * @BRACU  - 19101268
 */

public class Tester {
    public static void main(String[] args) {
        System.out.println("\nParenthesis Balancing Checker Using Stack");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nData Structure:\n1. Array Based Stack\n2. Linked List Based Stack\n0. Exit");
            int select;
            while (true) {
                try {
                    System.out.print("Enter Choice: ");
                    select = input.nextInt();
                    if (select == 1 || select == 2 || select == 0) break;
                    else System.out.println("\nWrong Input! Please, Try Again.");
                } catch (InputMismatchException e) {
                    System.out.println("\nInput Format Mismatch! Please, Try Again.");
                    input.next();
                }
            }


            Stack stack;
            if (select == 1) stack = new ArrayBasedStack();
            else if (select == 2) stack = new LinkedListBasedStack();
            else break;

            System.out.print("Enter Equation: ");
            String equation = input.next();
            System.out.println("\n" + equation);

            char[] c = equation.toCharArray();
            boolean flag = true;

            for (int i = 0; i < equation.length(); i++) {
                if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
                    try {
                        stack.push(i + 1);
                        stack.push(c[i]);
                    } catch (StackOverflowException e) {
                        System.out.println("Stack Overflow Exception");
                    }
                } else if (c[i] == ')' || c[i] == '}' || c[i] == ']') {
                    try {
                        if (stack.isEmpty()) {
                            System.out.println("This expression is NOT correct.\nError at character #" + (i + 1) + ". '" + c[i] + "'- not opened.");
                            flag = false;
                            break;
                        } else {
                            if ((char) stack.peek() == '(' && c[i] == ')') {
                                stack.pop();
                                stack.pop();
                            } else if ((char) stack.peek() == '{' && c[i] == '}') {
                                stack.pop();
                                stack.pop();
                            } else if ((char) stack.peek() == '[' && c[i] == ']') {
                                stack.pop();
                                stack.pop();
                            } else {
                                Object later = stack.pop();
                                System.out.println("This expression is NOT correct.\nError at character #" + stack.pop() + ". '" + later + "'- not closed");
                                flag = false;
                                break;
                            }
                        }
                    } catch (StackUnderflowException e) {
                        System.out.println("Under Flow Exception");
                    }
                }
            }

            if (!stack.isEmpty() && flag) {
                try {
                    System.out.println("This expression is NOT correct.\nError at character #" + stack.pop() + ". '" + stack.pop() + "'- not closed.");
                } catch (StackUnderflowException e) {
                    System.out.println("Under Flow Exception");
                }
            } else if (flag) System.out.println("This expression is correct.");
        }
        System.out.println("\nThank You");
    }
}