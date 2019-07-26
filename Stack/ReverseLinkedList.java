import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Reversing a LinkedList using Stack.
 */
public class ReverseLinkedList {

    /**
     * Reverse order of elements in a linked list.
     *
     * @param list LinkedList object.
     * @return Reversed the order of elements LinkedList object.
     */
    private static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> result = new LinkedList<>();

        /* put elements on the stack */
        for (Integer value : list)
            stack.push(value);

        /* put words from stack to linked list with reverse */
        while (!stack.empty())
            result.add(stack.pop());

        return result;
    }

    /**
     * Test the reverse method.
     *
     * @param args Command Line Interface arguments.
     */
    public static void main(String[] args) {
        /* input */
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        /* given */
        LinkedList<Integer> result = reverse(list);

        /* out */
        System.out.println(Arrays.toString(result.toArray()));
    }
}
