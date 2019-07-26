import java.util.Stack;

/**
 * Reverse the order of words in a String using Stack.
 */
public class ReverseTextWords {

    /**
     * Reverse the order of words in a String algorithm.
     *
     * @param text Some text of string type.
     *             Example:
     *             "An example of a string data type".
     * @return Reversed the order of words.
     *             Example:
     *             "type data string a of example An".
     */
    private static String reverse(String text) {
        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        /* put words on the stack */
        for (String word : text.split(" "))
            stack.push(word);

        /* put words from stack to string builder with reverse */
        while (stack.empty())
            result.append(stack.pop()).append(" ");

        return result.toString();
    }

    /**
     * Test the reverse method.
     *
     * @param args Command Line Interface arguments.
     */
    public static void main(String[] args) {
        /* input */
        String input = "An example of a string data type";

        /* given */
        String given = reverse(input);

        /* out */
        System.out.println(given); // type data string a of example An
    }
}
