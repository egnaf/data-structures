import java.util.ArrayList;
import java.util.List;

/**
 * Convert two dimensional array to two dimensional ArrayList.
 */
public class ConvertTwoDimensionalArrayList {

    /**
     * Convert two dimensional array to two dimensional ArrayList and return it.
     *
     * @param array Two dimensional array.
     * @return Two dimensional ArrayList.
     */
    private static ArrayList<ArrayList<Integer>> convert(int[][] array) {
        /* convert new rows */
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();

        for (int[] ints : array) {

            /* convert a new row */
            ArrayList<Integer> row = new ArrayList<>();

            /* add elements of array to the row list */
            for (int anInt : ints) {
                row.add(anInt);
            }

            /* add row to the rows list */
            rows.add(row);
        }
        return rows;
    }

    /**
     * Test the convert method.
     *
     * @param args Command Line Interface arguments.
     */
    public static void main(String[] args) {
        /* input */
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        /* given */
        List list = convert(array);

        /* out */
        System.out.println(list); // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    }
}
