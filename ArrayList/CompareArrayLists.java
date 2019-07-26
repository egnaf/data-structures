import java.util.ArrayList;
import java.util.List;

/**
 * Compare ArrayList objects.
 */
public class CompareArrayLists {

    /**
     * A method to compare arrayList's.
     *
     * @param a First ArrayList object.
     * @param b Second ArrayList object.
     * @return Returns true if ArrayList is equal, otherwise returns false.
     */
    private static boolean compare(List<Integer> a, List<Integer> b) {
        /* compare sizes */
        if (a.size() != b.size())
            return false;

        /* compare values */
        for (int i = 0; i < a.size(); i++) {
            if (!b.get(i).equals(a.get(i)))
                return false;
        }
        return true;
    }

    /**
     * Test the compare method.
     *
     * @param args Command Line Interface arguments.
     */
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        /* input */
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);

        /* given */
        boolean result = compare(a, b);

        /* out */
        System.out.println(result); // true
    }
}
