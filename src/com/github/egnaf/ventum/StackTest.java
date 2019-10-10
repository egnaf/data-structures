package com.github.egnaf.ventum;

public class StackTest {

    public static void main(String[] args) {

        StackImpl<Integer> stack = new StackImpl<>();

        /* push elements */
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack); // out: [1, 2, 3, 4]

        /* pop */
        stack.pop();

        System.out.println(stack); // out: [1, 2, 3]

        /* peek */
        System.out.println(stack.peek()); // out: 3
    }
}
