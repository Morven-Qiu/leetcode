package src.interview.inversestack;

import java.util.Stack;

/**
 * Created by morven on 2018/7/16.
 */
public class Solution1 {

    public static int getAndRemoveLastElment(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElment(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int i = getAndRemoveLastElment(stack);
        reverse(stack);
        stack.push(i);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        reverse(stack);

        System.out.println(stack);
    }
}
