import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Converting List object to int array.
 */
public class ConvertListToArray {

    /**
     * Converting List object to int array in Java 7.
     *
     * @param list List object.
     * @return Array of int's.
     */
    private static int[] convertInJava7(List<Integer> list) {
        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++){

            /* auto-unboxing from Integer to int */
            result[i] = list.get(i);
        }
        return result;
    }

    /**
     * Converting List object to int array in Java 8.
     *
     * @param list List object.
     * @return int array.
     */
    private static int[] convertInJava8(List<Integer> list) {
        return list.stream().mapToInt(i -> i).toArray();
    }

    /**
     * Test the convert methods.
     *
     * @param args Command Line Interface arguments.
     */
    public static void main(String[] args) {
        /* input */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        /* given */
        int[] array1 = ConvertListToArray.convertInJava7(list);
        int[] array2 = ConvertListToArray.convertInJava8(list);

        /* out */
        System.out.println(Arrays.toString(array1)); // [1, 2]
        System.out.println(Arrays.toString(array2)); // [1, 2]
    }
}
