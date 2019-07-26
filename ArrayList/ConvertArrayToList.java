import java.util.ArrayList;
import java.util.List;

/**
 * Convert array to List.
 */
public class ConvertArrayToList {

    /**
     * Convert array of int's to List.
     *
     * @param array Array of int's.
     * @return List object.
     */
    private static List convert(int[] array) {
        List<Integer> list = new ArrayList<>();

        /* put the array of int's to list */
        for (int i : array) {
            list.add(i);
        }

        return list;
    }

    /**
     * Test the convert method.
     *
     * @param args Command Line Interface arguments.
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // given
        List list = convert(array);

        // out
        System.out.println(list);
    }
}